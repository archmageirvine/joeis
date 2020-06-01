package irvine.oeis.a000;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;
import irvine.util.Point;

/**
 * A000942 Number of free planar polyenoids with n nodes.
 * @author Sean A. Irvine
 */
public class A000942 implements Sequence, GraphProcessor {

  // Step 1: Generate all tri-valent trees with n nodes
  // Step 2: For each tree generate all possible embeddings in hexagonal lattice
  // Step 3: Apply normalization to move bounding box of embedding to (0,0)
  // Step 4: Apply symmetry transformations to check if given embedding not seen previously

  /*
       We use a somewhat complicated representation of the hexagonal lattice so that
       storing explicit edges in the lattice can be avoided.  Each lattice coordinate
       is represented by a pair (x,y) with (0,2) as the start point.  You can either go
       directly down to (0,-2) or up left to (-2,4) or up right to (2,4).  Half these
       steps are given by the DELTA_X and DELTA_Y arrays.  We step by two units so we
       can treat the intervening points (0,0), (-1,3), (1,3) as mid-points for edges.
       This means that later on, determining if two embeddings are the same can be
       done by the points they include rather than any consideration of actual path.
   */

  private static final Point START = new Point(0, 2);
  // Next three constants control how we can move from a given lattice point
  private static final int[] DELTA_X = {1, -1, 0};
  private static final int[] DELTA_Y = {1, 1, -2};
  private static final int[] SIGN = {0, 1, 0, -1, 0, 0, 0, 1, 0, -1, 0};
  private static final double SQRT3 = Math.sqrt(3);

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashMap<Point, Point> mPointRotationCache = new HashMap<>();
  protected int mN = 0;
  private long mTreeCount = 0;
  private long mEmbeddings = 0;
  private long mUniqueEmbeddings = 0;

  protected Set<Point> normalize(final Set<Point> points) {
    // Move so that every points is north east of (0,0)
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    for (final Point pt : points) {
      minX = Math.min(minX, pt.left());
      minY = Math.min(minY, pt.right());
    }
    if (minX == 0 && minY == 0) {
      return points; // already normal
    }
    assert minX <= 0 || minY <= 0;
    final Set<Point> normalized = new HashSet<>(points.size());
    for (final Point pt : points) {
      normalized.add(new Point(pt.left() - minX, pt.right() - minY));
    }
    return normalized;
  }

  protected Set<Point> reflect(final Set<Point> embedding) {
    final Set<Point> res = new HashSet<>(embedding.size());
    for (final Point pt : embedding) {
      res.add(new Point(-pt.left(), pt.right()));
    }
    return res;
  }

  private Point rotate60(final Point pt) {
    // Convert from special coordinates to true coordinate, perform rotation, and convert back
    final Point rotPt = mPointRotationCache.get(pt);
    if (rotPt != null) {
      return rotPt;
    }
    // Rotation is x*cos(theta)-y*sin(theta), x*sin(theta),y*cos(theta), theta = 60 degrees
    final int x = pt.left();
    final int y = pt.right();
    final double trueX = Math.sqrt(3) * x * 0.25;
    final double trueY = 0.25 * y;
    final double rotatedX = 0.5 * trueX - 0.5 * Math.sqrt(3) * trueY;
    final double rotatedY = 0.5 * Math.sqrt(3) * trueX + 0.5 * trueY;
    final int newX = (int) Math.round(4 * rotatedX / SQRT3);
    final int newY = (int) Math.round(4 * rotatedY);
    final Point newPt =  new Point(newX, newY);
    mPointRotationCache.put(pt, newPt);
    return newPt;
  }

  protected Set<Point> rotate60(final Set<Point> embedding) {
    final Set<Point> res = new HashSet<>(embedding.size());
    for (final Point pt : embedding) {
      res.add(rotate60(pt));
    }
    return res;
  }

  private boolean checkRotations(final Set<Set<Point>> uniqueEmbeddings, final Set<Point> normal) {
    if (uniqueEmbeddings.contains(normal)) {
      return false;
    }
    Set<Point> rotated = normal;
    for (int k = 1; k < 6; ++k) {
      rotated = normalize(rotate60(rotated));
      // The following condition is possibly true, but doesn't seem to give much extra speed
      //      if (rotated.equals(normal)) {
      //        return true;
      //      }
      if (uniqueEmbeddings.contains(normalize(rotated))) {
        return false;
      }
    }
    return true;
  }

  private void embeddingIsomorphismCheck(final Set<Set<Point>> uniqueEmbeddings, final Set<Point> embedding) {
    final Set<Point> normal = normalize(embedding);
    if (checkRotations(uniqueEmbeddings, normal)) {
      final Set<Point> reflectHorizontal = normalize(reflect(embedding));
      if (normal.equals(reflectHorizontal) || checkRotations(uniqueEmbeddings, reflectHorizontal)) {
        //System.out.println("Adding: " + normal);
        uniqueEmbeddings.add(new HashSet<>(normal)); // need to copy because "normal" could be modified later
      }
    }
  }

  protected boolean accept(final Set<Point> embedding) {
    // The base sequence accepts every non-isomorphic embedding
    return true;
  }

  private int sign(final int y) {
    return SIGN[5 + y % 6];
  }

  private void embed(final Graph graph, final Stack<Pair<Integer, Point>> stack, final Set<Integer> usedTreeNodes, final Set<Point> usedLatticeNodes, final Set<Set<Point>> uniqueEmbeddings) {
    if (stack.isEmpty()) {
      ++mEmbeddings;
      embeddingIsomorphismCheck(uniqueEmbeddings, usedLatticeNodes);
      return;
    }
    final Pair<Integer, Point> state = stack.pop();
    final int node = state.left();
    if (!usedTreeNodes.add(node)) {
      throw new RuntimeException();
    }
    final Point latticeNode = state.right();
    // We need to attempt to embed "node" at an unused adjacent lattice position.
    // The coordinates of adjacent nodes depend on the current node and whether the vertical
    // node should be upwards or downwards from the current node.
    final int x = latticeNode.left();
    final int y = latticeNode.right();
    final int sign = sign(y);
    // Step through all adjacent lattice nodes.  Actually we step two units in each
    // direction as this means don't need to store an explicit path to compare if two
    // representations are the same.
    // If this is the very first edge, only consider one direction (efficiency)
    final int limit = usedTreeNodes.size() <= 2 ? 1 : DELTA_X.length;
    for (int k = 0; k < limit; ++k) {
      final int nx = x + 2 * DELTA_X[k];
      final int ny = y + sign * 2 * DELTA_Y[k];
      final Point nLatticeNode = new Point(nx, ny);
      if (usedLatticeNodes.add(nLatticeNode)) {
        // Can use this node as it is currently not occupied
        // Also mark the intermediate node along the edge
        final Point midEdge = new Point(x + DELTA_X[k], y + sign * DELTA_Y[k]);
        if (!usedLatticeNodes.add(midEdge)) {
          throw new RuntimeException();
        }
        // Queue up all adjacent nodes
        int v = 0;
        int q = 0;
        while ((v = graph.nextVertex(node, v)) > 0) {
          if (!usedTreeNodes.contains(v)) {
            stack.push(new Pair<>(v, nLatticeNode));
            ++q;
          }
        }
        embed(graph, stack, usedTreeNodes, usedLatticeNodes, uniqueEmbeddings);
        while (--q >= 0) {
          stack.pop();
        }
        usedLatticeNodes.remove(midEdge);
        usedLatticeNodes.remove(nLatticeNode);
      }
    }
    usedTreeNodes.remove(node);
    stack.push(state);
  }

  @Override
  public void process(final Graph graph) {
    ++mTreeCount;
    // Embed first vertex at (0,2)
    final Set<Point> usedLatticeNodes = new HashSet<>();
    final Set<Integer> usedTreeNodes = new HashSet<>();
    final Stack<Pair<Integer, Point>> stack = new Stack<>();
    final Set<Set<Point>> uniqueEmbeddings = new HashSet<>();
    usedLatticeNodes.add(START);
    usedTreeNodes.add(0);
    int v = 0;
    while ((v = graph.nextVertex(0, v)) > 0) {
      stack.push(new Pair<>(v, START));
    }
    embed(graph, stack, usedTreeNodes, usedLatticeNodes, uniqueEmbeddings);
    for (final Set<Point> normal : uniqueEmbeddings) {
      if (accept(normal)) {
        ++mUniqueEmbeddings;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mTreeCount = 0;
    mEmbeddings = 0;
    mUniqueEmbeddings = 0;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMaxEdges(mN - 1);
    gg.setMinEdges(mN - 1);
    gg.setMaxDeg(3);
    gg.setProcessor(this);
    gg.sanitizeParams();
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    if (mVerbose) {
      System.out.println("n: " + mN + " trees: " + mTreeCount + " embeddings: " + mEmbeddings);
    }
    return Z.valueOf(mUniqueEmbeddings);
  }
}

