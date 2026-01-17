package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390341 Number of vertically centered alternating sign matrices of size 2*n+1.
 * @author Sean A. Irvine
 */
public class A390341 extends Sequence0 {

  // After Ludovic Schwob

  private int mN = -1;

  private static final class IntArrayKey {
    private final int[] mA;
    private final int mHash;

    private IntArrayKey(final int[] a) {
      mA = a;
      mHash = Arrays.hashCode(mA);
    }

    @Override
    public boolean equals(final Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof IntArrayKey)) {
        return false;
      }
      return Arrays.equals(mA, ((IntArrayKey) o).mA);
    }

    @Override
    public int hashCode() {
      return mHash;
    }
  }

  private static List<int[]> alternatingCovers(final int[] l) {
    final int n = l.length;
    final List<int[]> end0 = new ArrayList<>();
    final List<int[]> end1 = new ArrayList<>();
    end1.add(l.clone());
    for (int k = 0; k < n; ++k) {
      if (l[k] == 0) {
        for (final int[] x : end1) {
          final int[] y = x.clone();
          ++y[k];
          end0.add(y);
        }
      } else {
        for (final int[] x : end0) {
          final int[] y = x.clone();
          --y[k];
          end1.add(y);
        }
      }
    }
    return end0;
  }

  @Override
  public Z next() {
    ++mN;
    final int m = 2 * mN + 1;

    Map<IntArrayKey, Z> d = new HashMap<>();
    d.put(new IntArrayKey(new int[m]), Z.ONE);

    for (int i = 0; i < m; ++i) {
      final Map<IntArrayKey, Z> d2 = new HashMap<>();
      for (final Map.Entry<IntArrayKey, Z> e : d.entrySet()) {
        final int[] x = e.getKey().mA;
        final Z dx = e.getValue();
        for (final int[] y : alternatingCovers(x)) {
          int s = 0;
          for (int k = 0; k < m; ++k) {
            s += k * (y[k] - x[k]);
          }
          if (s == mN) {
            final IntArrayKey key = new IntArrayKey(y);
            d2.merge(key, dx, Z::add);
          }
        }
      }
      d = d2;
    }
    final int[] ones = new int[m];
    Arrays.fill(ones, 1);
    return d.getOrDefault(new IntArrayKey(ones), Z.ZERO);
  }
}
