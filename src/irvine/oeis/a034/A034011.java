package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034011 Positive integers k corresponding to certain genus 2 curves y^2 = x^5 - k.
 * @author Sean A. Irvine
 */
public class A034011 extends Sequence1 {

  private long mN = -1;

  private long[] val(final long a, final long p) {
    long m = a;
    long v = 0;
    while (m % p == 0) {
      m /= p;
      ++v;
    }
    return new long[] {v, m};
  }

  private boolean isSquare(final long a, final long mod) {
    return Functions.JACOBI.i(a, mod) == 1;
  }

  private boolean isEvenOrder(final long l, final long p) {
    return Functions.ORDER.z(p, l).isEven();
  }

  private boolean isOk(final long a) {
    for (final Z pp : Jaguar.factor(-a).toZArray()) {
      final long p = pp.longValue();
      if (p > 2) {
        final long[] vpa = val(a, p);
        if ((vpa[0] & 1) == 0 && (isSquare(vpa[1], p) || isEvenOrder(5, p))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final long r = --mN % 25;
      if (r == -2 || r == -12 || r == -23 || r == -13) {
        final long[] v2a = val(mN, 2);
        final long v2 = v2a[0];
        final long a2 = v2a[1];
        if (v2 == 8 || (v2 & 1) == 1 || a2 % 4 == -1) {
          if (isOk(mN) && LongUtils.hurwitzClassNumber(4 * mN) % 5 != 0 && LongUtils.hurwitzClassNumber(4 * 5 * mN) % 5 != 0) {
            return Z.valueOf(-mN);
          }
        }
      }
    }
  }
}

