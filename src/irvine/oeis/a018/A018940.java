package irvine.oeis.a018;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Quadruple;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A018940.
 * @author Sean A. Irvine
 */
public class A018940 implements Sequence {

  // todo better to use packed 4 integer, cf. walk code

  private int mN = 0;

  /*
  The neighbourhood table of ABW.
periodicity 3
% No. of vertices: 4
% No. of edges: 8
   a-1:    a-4(000)    a-3(+0+)    a-3(000)    a-2(0+0)
   a-2:    a-4(+0+)    a-4(000)    a-3(0-+)
   a-3:    a-4(0+0)
% End
   */

  private final int[][][] mQuotientGraph = {
    {{3, 0, 0, 0}, {2, 1, 0, 1}, {2, 0, 0, 0}, {1, 0, 1, 0}},
    {{2, 1, 0, 1}, {2, 0, 0, 0}, {1, 0, -1, 1}, {-1, 0, -1, 0}},
    {{1, 0, 1, 0}, {-1, 0, 1, -1}, {-2, 0, 0, 0}, {-2, -1, 0, -1}},
    {{-1, 0, -1, 0}, {-2, 0, 0, 0}, {-2, -1, 0, -1}, {-3, 0, 0, 0}},
  };


  // Vertices are fixed in number (here 4), but repeat indefinitely through the structure
  // Pack the "name" of a vertex into a long
  // If n is current node, then next node is something like
  // n + delta(n) + 4 * delta(b) + 8 * delta(c) + 16 delta(d)
  // Thus the whole long-delta can be precomputed
  // Ideally make this more generic to handle arbitrary number of vertices etc.

  private long[][] quotientToLongDeltas(final int[][][] graph) {
    final int vertices = graph.length;
    final long[][] delta = new long[vertices][];
    // todo round-up vertices to power of 2
    // todo idiot checking on mQuotientGraph input
    for (int v = 0; v < vertices; ++v) {
      final int neighbours = mQuotientGraph[v].length;
      delta[v] = new long[neighbours];
      for (int k = 0; k < neighbours; ++k) {
        final int[] s = mQuotientGraph[v][k];
        //delta[v][k] = s[0] + 4 * s[1] + 8 * s[2] + 16 * s[3];
        delta[v][k] = s[0] + 4 * s[1] + 32 * s[2] + 128 * s[3]; // todo spacing here is critical to correct behavior
        // todo need to make spacing bigger for higher entries -- this is still way tooooo slow
      }
    }
    return delta;
  }

  private final long[][] mQuotientDelta = quotientToLongDeltas(mQuotientGraph);
  // Move out into the grid, so we never end up at a negative coordinate
  private final long mOrigin = 4 << 12; // todo fix this magic constant 1000

  private final LongDynamicBooleanArray mVisited = new LongDynamicBooleanArray();

  private void search(final long point, final int n) {
    if (n == mN) {
      if (point == mOrigin) {
        ++mCount;
      }
      return;
    }

    // todo Check if we are too far away to make in back

    if (!mVisited.isSet(point)) {
      mVisited.set(point);
      for (final long delta : mQuotientDelta[(int) (point & 3)]) { // todo magic 3 here!
        search(point + delta, n + 1);
      }
      mVisited.clear(point);
    }
  }



  private static final class IQ extends Quadruple<Integer> {
    private IQ(final int a, final int b, final int c, final int d) {
      super(a, b, c, d);
    }
  }

  private static final IQ ORIGIN = new IQ(0, 0, 0, 0);

  private final HashSet<IQ> mSeen = new HashSet<>();
  private long mCount = 0;

  private void search(final IQ point, final int n) {
    if (n == mN) {
      if (point.equals(ORIGIN)) {
        ++mCount;
      }
      return;
    }

    // Check if we are too far away to make in back
    final int m = mN - n;
    if (Math.abs(point.b()) + Math.abs(point.c()) + Math.abs(point.d()) > m + 1) { // todo hmmm, some moves reduce 2 coords by 2 -- this might not be enough
      return; // will never make it back in time
    }

    if (mSeen.add(point)) {
      for (final int[] delta : mQuotientGraph[point.a()]) {
        search(new IQ(point.a() + delta[0], point.b() + delta[1], point.c() + delta[2], point.d() + delta[3]), n + 1);
      }
      mSeen.remove(point);
    }
  }

  @Override
  public Z next() {
    mN += 2; // AWB always even cycle length
    mCount = 0;
//    search(ORIGIN, 0);
    search(mOrigin, 0);
    return Z.valueOf(mCount / 2); // why this /2? -- direction around cycle?
  }
}

