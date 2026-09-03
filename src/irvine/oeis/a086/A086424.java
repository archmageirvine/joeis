package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086424 Numbers needed to generate all other natural numbers, only allowing multiplication and addition. Each number can be used only once.
 * @author Sean A. Irvine
 */
public class A086424 extends Sequence1 {

  // After Charles R Greathouse IV

  private final List<Long> mA = new ArrayList<>();

  private static void ww(final long[] v, final Set<Long> result) {
    if (v.length == 2) {
      result.add(v[0]);
      result.add(v[1]);
      result.add(v[0] + v[1]);
      result.add(v[0] * v[1]);
      return;
    }

    for (int i = 0; i < v.length - 1; ++i) {
      for (int j = i + 1; j < v.length; ++j) {
        final long[] w = new long[v.length - 1];
        int k = 0;
        for (int r = 0; r < v.length; ++r) {
          if (r != i && r != j) {
            w[k++] = v[r];
          }
        }
        w[k] = v[i] + v[j];
        ww(w, result);
        w[k] = v[i] * v[j];
        ww(w, result);
      }
    }
  }

  private static long[] ww(final long[] v) {
    final Set<Long> set = new TreeSet<>();
    ww(v, set);
    final long[] result = new long[set.size()];
    int k = 0;
    for (final Long x : set) {
      result[k++] = x;
    }
    return result;
  }

  @Override
  public Z next() {
    final int n = mA.size();
    final long res;
    outer:
    switch (n) {
      case 0:
        res = 1;
        break;
      case 1:
        res = 2;
        break;
      case 2:
        res = 4;
        break;
      default:
        final long[] a = new long[mA.size()];
        for (int i = 0; i < a.length; ++i) {
          a[i] = mA.get(i);
        }
        final long[] v = ww(a);
        final long start = 2 * a[a.length - 1];
        for (long i = start; i <= v.length; ++i) {
          if (v[(int) i - 1] > i) {
            res = i;
            break outer;
          }
        }
        throw new IllegalStateException("No new term found");
    }
    mA.add(res);
    return Z.valueOf(res);
  }
}

