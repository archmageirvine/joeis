package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000361 From a fractal set of positive Lebesgue measure, a self-replicating tiling with holes, the 4-reptile following the 2-reptile of Paul Levy.
 * @author Sean A. Irvine
 */
public class A000361 extends Sequence0 {

  private int mN = -1;

  /**
   * Transform a list as in f(v,c,h).
   * @param v input list
   * @param c parameter c (0 or 1)
   * @param h parameter h
   * @return transformed list
   */
  private static List<Long> f(final List<Long> v, final int c, final int h) {
    final List<Long> result = new ArrayList<>(v.size());
    for (final long x : v) {
      result.add(2L * (x + h) + c - (2L * c + 1) * (x % 2));
    }
    return result;
  }

  /**
   * Compute w(n).
   * @param n index
   * @return list w(n)
   */
  private static List<Long> w(final int n) {
    if (n < 1) {
      final List<Long> result = new ArrayList<>();
      if (n == 0) {
        result.add(1L);
      }
      return result;
    }

    final int m = n / 2;
    if ((n & 1) != 0) {
      return f(w(m), m % 3 == 2 ? 0 : 1, 1);
    }

    final List<Long> result = f(w(m), m % 3 == 0 ? 0 : 1, 0);
    result.addAll(f(w(m - 1), m % 3 == 2 ? 0 : 1, 0));
    return result;
  }

  @Override
  public Z next() {
    ++mN;
    final List<Long> v = w(mN);
    v.sort(Collections.reverseOrder());
    Z result = Z.ZERO;
    for (final long x : v) {
      result = result.multiply(Z.TWO).add((x & 1L) == 0 ? Z.ZERO : Z.ONE);
    }
    return result;
  }
}

