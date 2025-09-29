package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080715 Numbers k such that for any positive integers (a, b), if a * b = k then a + b is prime.
 * @author Sean A. Irvine
 */
public class A080715 extends Sequence1 {

  private long mN = -1;

  private boolean is(final long n) {
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!d.add(n / d.longValue()).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE; // only odd term
    }
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
