package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394706 Numbers k such that k*2^d - 1 is nonprime for any of its divisors d.
 * @author Sean A. Irvine
 */
public class A394706 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (Z.ONE.shiftLeft(d.longValue()).multiply(n).subtract(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
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
