package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394710 Numbers k such that the sum of the number of divisors of its proper divisors including 1, each number of divisors to some power greater than zero, is equal to k itself.
 * @author Sean A. Irvine
 */
public class A394710 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long[] s, final long sum, final int pos) {
    if (pos < 0) {
      return sum == 0;
    }
    if (sum <= 0) {
      return false;
    }
    final long d = s[pos];
    long f = d;
    while (f <= sum) {
      if (is(s, sum - f, pos - 1)) {
        return true;
      }
      if (d == 1) {
        break;
      }
      f *= d;
    }
    return false;
  }

  private boolean is(final long n) {
    final Z[] d = Jaguar.factor(n).divisorsSorted();
    final long[] s = new long[d.length - 1];
    for (int k = 0; k < s.length; ++k) {
      s[k] = Functions.SIGMA0.l(d[k]);
    }
    return is(s, n, s.length - 1);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
