package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058049.
 * @author Sean A. Irvine
 */
//public class A058050 extends MemorySequence {
//
//  {
//    add(null); // 0
//  }
//
//  @Override
//  protected Z computeNext() {
//    final int n = size();
//    if (n <= 3) {
//      return Z.ONE;
//    }
//    Z sum = Z.ZERO;
//    for (int k = 1; k < (n + 1) / 2; ++k) {
//      sum = sum.add(get(k).multiply(get(n - k)));
//    }
//    if ((n & 1) == 0) {
//      sum = sum.add(get(n / 2));
//    }
//    return sum;
//  }
//}

public class A058050 implements Sequence {

  private static final class Graph {
    private final int[][] mLinks;

    /** Construct graph for n == 1. */
    private Graph() {
      mLinks = new int[1][2];
    }

    /** Construct graph of order n with specified components. */
    private Graph(final int n, final Graph a, final Graph b) {
      // Assumes order(x) >= order(y)
      mLinks = Arrays.copyOf(a.mLinks, n);
      for (int k = a.mLinks.length; k < n - 1; ++k) {
        mLinks[k] = new int[2];
      }
      mLinks[n - 1] = new int[] {a.mLinks.length - 1, b.mLinks.length - 1};
      for (int k = 2; k < b.mLinks.length; ++k) {
        if (b.mLinks[k][0] != 0) {
          assert mLinks[k][0] == 0;
          mLinks[k] = b.mLinks[k];
        }
      }
    }

    @Override
    public int hashCode() {
      return Arrays.deepHashCode(mLinks);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Graph && Arrays.deepEquals(mLinks, ((Graph) obj).mLinks);
    }
  }

  private final List<Set<Graph>> mA = new ArrayList<>();

  private boolean isCompatible(final Graph x, final Graph y) {
    // Assumes order(x) >= order(y)
    for (int k = 2; k < y.mLinks.length; ++k) {
      if (x.mLinks[k][0] != 0 && y.mLinks[k][0] != 0 && !Arrays.equals(x.mLinks[k], y.mLinks[k])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(null); // 0
      mA.add(Collections.singleton(new Graph()));
    } else {
      final int n = mA.size();
      final HashSet<Graph> graphs = new HashSet<>();
      for (int k = 1; k <= n / 2; ++k) {
        for (final Graph x : mA.get(n - k)) {
          for (final Graph y : mA.get(k)) {
            if (isCompatible(x, y)) {
              graphs.add(new Graph(n, x, y));
            }
          }
        }
      }
      mA.add(graphs);
    }
    return Z.valueOf(mA.get(mA.size() - 1).size());
  }
}
