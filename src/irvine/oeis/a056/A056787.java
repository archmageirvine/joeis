package irvine.oeis.a056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056785.
 * @author R. J. Mathar
 * @author Sean A. Irvine (Java port)
 */
public class A056787 implements Sequence {

  // 2022-05-09 Some data structures changed to avoid need for sorting

  /**
   * A node is one point on the square lattice.
   * A node contains simply the two integer coordinates of a point on the
   * square lattice.
   */
  private static class Node implements Comparable<Node> {

    private final int[] mXY;

    /**
     * Constructor with a pair of coordinates.
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    private Node(final int x, final int y) {
      mXY = new int[] {x, y};
    }

    private Node(final Node node) {
      mXY = new int[] {node.mXY[0], node.mXY[1]};
    }

    /**
     * Constructor with a given original node translated into a direction.
     * @param n the node to start from
     * @param dir a parameter from 0 to 7 to indicate in which
     * direction of the node n this node that is created here
     * is to be placed.
     */
    private Node(final Node n, final int dir) {
      /* For values of the dir argument from 0 to 3
       * we create the new node one step into the East (+x),
       * North (+y), West (-x) or South (-y) from the original one.
       */
      switch (dir) {
        case 0:
          mXY = new int[] {n.mXY[0] + 1, n.mXY[1]};
          break;
        case 1:
          mXY = new int[] {n.mXY[0] + 1, n.mXY[1] + 1};
          break;
        case 2:
          mXY = new int[] {n.mXY[0], n.mXY[1] + 1};
          break;
        case 3:
          mXY = new int[] {n.mXY[0] - 1, n.mXY[1] + 1};
          break;
        case 4:
          mXY = new int[] {n.mXY[0] - 1, n.mXY[1]};
          break;
        case 5:
          mXY = new int[] {n.mXY[0] - 1, n.mXY[1] - 1};
          break;
        case 6:
          mXY = new int[] {n.mXY[0], n.mXY[1] - 1};
          break;
        case 7:
          mXY = new int[] {n.mXY[0] + 1, n.mXY[1] - 1};
          break;
        default:
          throw new IllegalArgumentException();
      }
    }

    /**
     * Create a new node derived from this one by one of the eight
     * symmetry operations of the square.
     * @param mode a value from 0 to 7 indicative of which symmetry operation
     * of the square is used to place the imaged node.
     */
    private Node congruent(final int mode) {
      /* parameters mode from 0 to 7 generate a new node that is
       * either the original one (mode=0), rotated around the (0,0) center
       * of the coordinates by multiples of 90 degrees (mode=1 to 4), or
       * created in a two-step process of first reflecting the node across the
       * main (x=y) diagonal of the coordinates and then rotating it to
       * a place away a multiple of 90 degrees.
       */
      switch (mode) {
        case 0:
          return this;
        case 1:
          // 90 degrees rotated
          return new Node(-mXY[1], mXY[0]);
        case 2:
          // 180 degrees rotated
          return new Node(-mXY[0], -mXY[1]);
        case 3:
          // 270 degrees rotated
          return new Node(mXY[1], -mXY[0]);
        case 4:
          // mirror main diagonal
          return new Node(mXY[1], mXY[0]);
        case 5:
          // mirror main diagonal then 90 degrees rotated
          return new Node(-mXY[0], mXY[1]);
        case 6:
          // mirror main diagonal then 180 degrees rotated
          return new Node(-mXY[1], -mXY[0]);
        case 7:
          // mirror main diagonal then 270 degrees rotated
          return new Node(mXY[0], -mXY[1]);
        default:
          throw new RuntimeException();
      }
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Node)) {
        return false;
      }
      final Node other = (Node) obj;
      return Arrays.equals(mXY, other.mXY);
    }

    @Override
    public int compareTo(final Node o) {
      final int c = Integer.compare(mXY[1], o.mXY[1]);
      if (c != 0) {
        return c;
      }
      return Integer.compare(mXY[0], o.mXY[0]);
    }
  }

  /**
   * The edge class is a pair of nodes connected by an edge.
   * The connectivity is implicit, and only the two coordinates of the
   * pair of nodes are stored.
   */
  private static final class Edge implements Comparable<Edge> {
    /* The pair of nodes, assumed  ordered such that nodes[0] < nodes[1].
     * To form an edge, nodes[0]!=nodes[1] in all cases.
     */
    private final Node[] mNodes = new Node[2];

    /**
     * The constructor with a pair of nodes.
     * @param n1 one of the two nodes.
     * @param n2 the other one of the two nodes.
     */
    Edge(final Node n1, final Node n2) {
      if (n1.compareTo(n2) < 0) {
        mNodes[0] = n1;
        mNodes[1] = n2;
      } else {
        mNodes[0] = n2;
        mNodes[1] = n1;
      }
    }

    /**
     * This constructs a congruent version of the existing node.
     * @param mode a value form 0 to 7 representing
     * any of the eight ways (including the identity/copy) to generate an
     * image of the node by rotation and reflection.
     * @return the new edge rotated and/or reflected with respect to the
     * origin.
     */
    private Edge congruent(final int mode) {
      return new Edge(mNodes[0].congruent(mode), mNodes[1].congruent(mode));
    }

    /**
     * Translate the edge.
     * On return, the edge is moved by dx and dy into the two directions on the square grid.
     * @param dx the integer value for motion into the x direction
     * @param dy the integer value for motion into the y direction
     */
    private void shift(final int dx, final int dy) {
      mNodes[0].mXY[0] += dx;
      mNodes[1].mXY[0] += dx;
      mNodes[0].mXY[1] += dy;
      mNodes[1].mXY[1] += dy;
    }

    @Override
    public int compareTo(final Edge other) {
      final int c = mNodes[0].compareTo(other.mNodes[0]);
      if (c != 0) {
        return c;
      }
      return mNodes[1].compareTo(other.mNodes[1]);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Edge)) {
        return false;
      }
      final Edge other = (Edge) obj;
      return mNodes[0].equals(other.mNodes[0]) && mNodes[1].equals(other.mNodes[1]);
    }
  }

  /**
   * A tree is a list/list of edges, all of which are different, and which
   * share nodes such that one can transverse the graph on a trail that
   * may reach each of the nodes.
   */
  private static final class Tree {
    /* The list of all edges is the only full representation of the tree. */
    private final List<Edge> mEdges;
    /* The bbox contains a bounding box, such that bbox[0] is the smallest x,
     * bbox[1] the smallest y, bbox[2] the largest x and bbox[3] the largest y value of
     * all nodes of the edges.
     */
    private final int[] mBoundingBox;

    /* The default constructor creates an empty tree.
     * It is useful to generated lists of trees and has no other significance.
     */
    private Tree() {
      mEdges = new ArrayList<>();
      mBoundingBox = new int[4];
    }

    /**
     * Copy constructor.
     * @param t tree
     */
    private Tree(final Tree t) {
      mBoundingBox = Arrays.copyOf(t.mBoundingBox, t.mBoundingBox.length);
      // Deep copy
      mEdges = new ArrayList<>(t.mEdges.size());
      for (final Edge e : t.mEdges) {
        mEdges.add(new Edge(new Node(e.mNodes[0]), new Node(e.mNodes[1])));
      }
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Tree)) {
        return false;
      }
      final Tree t1 = this;
      final Tree t2 = (Tree) obj;
      /* Trees of different edge counts are different */
      if (t1.mEdges.size() != t2.mEdges.size()) {
        return false;
      }
      /* Trees of different bounding boxes are also different */
      else if ((t1.mBoundingBox[2] != t2.mBoundingBox[2] && t1.mBoundingBox[2] != t2.mBoundingBox[3])
        || (t1.mBoundingBox[3] != t2.mBoundingBox[2] && t1.mBoundingBox[3] != t2.mBoundingBox[3])) {
        return false;
      } else {
        /* Trees of same edge count and bounding box are the same if the lists
         * of edges, after sorting according to the same criteria of comparison operators,
         * are the same.
         */
        Collections.sort(t1.mEdges);
        Collections.sort(t2.mEdges);
        return t1.mEdges.equals(t2.mEdges);
      }
    }

    /**
     * Creates a congruent image of the current tree.
     * @param mode a number from 0 to 7 which
     * specifies which of the 8 symmetry operations (mode=0 is a copy) of the square
     * is used to generate the new tree.
     * @return the rotated/reflected tree
     */
    private Tree congruent(final int mode) {
      final Tree result = new Tree();
      /* The algorithm is simply to create the image of each edge separately,
       * and add it to the new tree with addedge().
       */
      for (Edge edge : mEdges) {
        final Edge cedge = edge.congruent(mode);
        result.addEdge(cedge);
      }
      /* The typical rotation would have created an image in any quadrant of
       * the coordinate system. For quicker comparison of congruent pairs (which are
       * to be eliminated according to the algorithm), we translate each tree such
       * it is placed in the upper-right quadrant with the smallest x and the smallest
       * y coordinate of all nodes being both 0.
       */
      result.normalize();
      return result;
    }

    /**
     * Create one more edge in the tree. This is done without
     * any further check such as ensuring that the edge is connected to the
     * already existing trunks or such as ensuring it is not yet part of the tree.
     * @param e the edge to be added
     */
    private void addEdge(final Edge e) {
      mEdges.add(e);
    }

    /**
     * Investigate whether the two trees are congruent.
     * The result is true if all the edges of this instance and the other instance
     * can be placed on each other by translation, rotation or mirror operation.
     * @param oth the other tree that is to be compared with the current instance.
     * It is assumed that its bounding box parameter is up-to-date.
     * @return true if this tree and the other one are congruent.
     */
    private boolean isCongruent(final Tree oth) {
      /* To avoid some overhead during the comparison, we compared some
       * rough parameters first: if the numbers of edges in the two trees differ,
       * the trees differ.
       */
      if (mEdges.size() != oth.mEdges.size()) {
        return false;
      }
      /* The congruent operations of rotations and reflections can swap
       * the bounding box x and y coordinates, but not change them otherwise.
       * So we conclude that the two trees differ if this test of matching fails.
       */
      if (mBoundingBox[2] != oth.mBoundingBox[2] && mBoundingBox[2] != oth.mBoundingBox[3]) {
        return false;
      }
      if (mBoundingBox[3] != oth.mBoundingBox[2] && mBoundingBox[3] != oth.mBoundingBox[3]) {
        return false;
      }

      /* The final more finally operation of deciding on congruence is to create
       * all 8 congruent images of oth and compare each of them with the
       * current instance. To speed up the comparison, we sort the edge list
       * of the current instance and each edge list of the 8 images created of the other
       * instance. This should result in a comparison time which is only linear in the
       * number of edges.
       */
      Collections.sort(mEdges);
      //sort(edges.begin(),edges.end() ) ;

      /* This is the loop over all possible 8 congruent versions of the other tree. */
      for (int c = 0; c < 8; ++c) {
        final Tree imag = oth.congruent(c);
        /* Sorting the edge list of the image copy and figuring out whether the
         * image lists are then the same is done with two calls of the STL library.
         * If we found that any of the 8 versions equals the current instance,
         * we do not need to investigate the other versions and may conclude
         * that both trees are congruent.
         */
        Collections.sort(imag.mEdges);
        if (mEdges.equals(imag.mEdges)) {
          return true;
        }
      }
      /* If we have fallen through the loop over the 8 images, none of these
       * was congruent and the result is a 'no'.
       */
      return false;
    }

    /**
     * A function to generate all trees with one more edge than the existing instance.
     * The current instance is the parent from which all possible ways of adding
     * one more edge to any existing node are tested. The children are reduced to
     * a set of mutually incongruent trees and returned in a list.
     * @return a list of the incongruent trees generated.
     */
    private List<Tree> children() {
      /* collect all new trees with one more edge than the current tree */
      final List<Tree> result = new ArrayList<>();

      /* For some efficiency, we generate a list of all nodes of the existing tree,
       * which are typically shared by between 1 and 4 edges. The idea is to spawn
       * new edges starting from any of these into any of the four directions
       * admitted by the square lattice.
       */

      /* In a loop over all existing nodes we can generate all child trees
       * that have the same skeleton as the current one, but one more edge.
       * This works since a tree is a connected graph, so edges cannot be isolated.
       */
      for (final Node node : allNodes()) {
        /* For each of the eight directions of the node we test whether this
         * can be the direction of a new edge for a potentially new child tree.
         */
        for (int dir = 0; dir < 8; ++dir) {
          /* For this particular node and direction, we test whether
           * the node and the new node are a candidate for extension. We generate
           * a new node into the particular direction, and admit this as a new
           * edge if this new site is not yet already occupied.
           */
          final Node tste = new Node(node, dir);
          /* Test on occupation of the point in the square lattice. */
          if (!haveNode(tste)) {
            /* If this node is not yet occupied (allowed since a tree is cycle-free),
             * we create the new child by first copying this tree, and adding
             * a new edge that spreads between the current node and the new one.
             */
            final Tree candidate = new Tree(this);
            candidate.addEdge(new Edge(new Node(node), tste));

            /* Adding the edge may have extended the new tree into the
             * quadrant to the left or below, so we shift the tree to the right
             * or up with normalize() to place it into the first quadrant
             * of the coordinate system.
             */
            candidate.normalize();
            /* This new child tree may already exist in the list of trees
             * generated before. We test whether it is congruent to any fo the
             * child trees already accumulated so far in the result list.
             */
            boolean isCongruent = false;
            for (Tree tree : result) {
              if (tree.isCongruent(candidate)) {
                isCongruent = true;
                break;
              }
            }
            /* If no version of the new child tree is found in the
             * current list of children, we put it into the result list.
             */
            if (!isCongruent) {
              result.add(candidate);
            }
          }
        }
      }

      /* The result list of children that are mutually incongruent is returned */
      return result;
    }

    /* The bounding box bbox is updated to reflect the actual
     * size of the tree.
     */
    void updateBoundingBox() {
      /* The algorithm scans each edge and both nodes in the edge
       * for the maximum and minimum coordinate in x and y, and updates
       * the four bounding box parameters where the edge sprawls outside
       * the bounding box seen so fare.
       */
      if (!mEdges.isEmpty()) {
        mBoundingBox[2] = mEdges.get(0).mNodes[0].mXY[0];
        mBoundingBox[0] = mEdges.get(0).mNodes[0].mXY[0];
        mBoundingBox[3] = mEdges.get(0).mNodes[0].mXY[1];
        mBoundingBox[1] = mEdges.get(0).mNodes[0].mXY[1];
      }
      for (Edge edge : mEdges) {
        mBoundingBox[0] = Math.min(mBoundingBox[0], edge.mNodes[0].mXY[0]);
        mBoundingBox[0] = Math.min(mBoundingBox[0], edge.mNodes[1].mXY[0]);
        mBoundingBox[1] = Math.min(mBoundingBox[1], edge.mNodes[0].mXY[1]);
        // mBoundingBox[1] = Math.min(mBoundingBox[1], mEdges.get(e).mNodes[1].mXY[1]); // nodes are sorted: sufficient to look at nodes[0] for the minimum y-component
        mBoundingBox[2] = Math.max(mBoundingBox[2], edge.mNodes[0].mXY[0]);
        mBoundingBox[2] = Math.max(mBoundingBox[2], edge.mNodes[1].mXY[0]);
        // mBoundingBox[3] = Math.max(mBoundingBox[3], mEdges.get(e).mNodes[0].mXY[1]); // nodes are sorted: sufficient to look at nodes[1] for the maximum y
        mBoundingBox[3] = Math.max(mBoundingBox[3], edge.mNodes[1].mXY[1]);
      }
    }

    /**
     * Normalization means rigid translation of the tree coordinates
     * (of all nodes in all edges) such that the tree is tightly fitting into
     * the first quadrant and the minimum x and y coordinates over all nodes are zero and zero.
     */
    void normalize() {
      updateBoundingBox();
      if (mBoundingBox[0] != 0 || mBoundingBox[1] != 0) {
        final int dx = -mBoundingBox[0];
        final int dy = -mBoundingBox[1];
        for (Edge edge : mEdges) {
          edge.shift(dx, dy);
        }
        mBoundingBox[0] = 0;
        mBoundingBox[1] = 0;
        mBoundingBox[2] += dx;
        mBoundingBox[3] += dy;
      }
    }

    /**
     * Test whether n is already part of the tree.
     * @param n the node to be found or not found in the current instance.
     * @return true if the node is part of any edge in the tree.
     */
    private boolean haveNode(final Node n) {
      /* In a simple linear search strategy, all edges and both nodes of each
       * of them is compared with the edge n.
       */
      for (Edge edge : mEdges) {
        if (edge.mNodes[0].equals(n) || edge.mNodes[1].equals(n)) {
          /* If we found a node in the tree that matches the candidate,
           * we report this as early as possible for efficiency.
           */
          return true;
        }
      }

      /* At this point of the program, we have fallen through the double loop over
       * edges and nodes and have not found any match. So the result is a 'no'.
       */
      return false;
    }

    /**
     * Generate a list of all nodes in the current tree.
     * @return the list of all nodes (duplicates removed) of the current tree.
     */
    private Collection<Node> allNodes() {
      final TreeSet<Node> result = new TreeSet<>();
      for (final Edge edge : mEdges) {
        result.add(new Node(edge.mNodes[0]));
        result.add(new Node(edge.mNodes[1]));
      }
      return result;
    }
  }

  /**
   * Create a new generation of child trees by generation of all incongruent
   * children of the trees in parent.
   * @param parent the existing forest of parent trees
   * @return the list of all incongruent trees with one more edge than
   * those of the parent list.
   */
  private List<Tree> step(final List<Tree> parent) {
    /* The result list */
    final List<Tree> result = new ArrayList<>();
    /* New trees are generated by spawning from each of the parent trees in turn, in a loop */
    for (Tree value : parent) {
      /* The child trees of this particular parent are collected in an intermediate
       * forest children.
       */
      final List<Tree> children = value.children();
      for (Tree child : children) {
        /* Each of this child trees is tested for congruency relative to the
         * existing full set of trees in the result list.
         */
        boolean congru = false;
        for (Tree tree : result) {
          if (tree.isCongruent(child)) {
            congru = true;
            break;
          }
        }
        /* If a congruent version is not yet there, we add the new child tree,
         * and if the verbose option was used, show and enumerate it on stdout.
         */
        if (!congru) {
          result.add(child);
        }
      }
    }
    return result;
  }

  private List<Tree> mA = null;

  @Override
  public Z next() {
    // The initialization here is done in a hacky way to handle n=0 case
    if (mA == null) {
      mA = new ArrayList<>();
      // The fundamental root trees (great grand root tree) are the ones from (0,0) to (1,0),
      // and from (0,0) to (1,1), with one edge and two nodes only.
      final Tree root1 = new Tree();
      final Edge strt1 = new Edge(new Node(0, 0), new Node(1, 0));
      root1.addEdge(strt1);
      root1.mBoundingBox[0] = 0;
      root1.mBoundingBox[1] = 0;
      root1.mBoundingBox[2] = 1;
      root1.mBoundingBox[3] = 0;
      mA.add(root1);
    } else if (mA.size() == 1) {
      final Tree root2 = new Tree();
      final Edge strt2 = new Edge(new Node(0, 0), new Node(1, 1));
      root2.addEdge(strt2);
      root2.mBoundingBox[0] = 0;
      root2.mBoundingBox[1] = 0;
      root2.mBoundingBox[2] = 1;
      root2.mBoundingBox[3] = 1;
      mA.add(root2);
    } else {
      mA = step(mA);
    }
    return Z.valueOf(mA.size());
  }
}
