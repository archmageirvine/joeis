package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A046462 Numbers k such that the concatenation of numbers from 1 to k is the product of 3 primes (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A046462 extends A007908 {

  private long mN = 0;

  protected long targetOmega() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      final long omega = Jaguar.factor(super.next()).bigOmegaBound();
      if (++mN > 1) {
        if (omega == targetOmega()) {
          return Z.valueOf(mN);
        }
        if (omega < 0 && omega > -targetOmega()) {
          throw new UnsupportedOperationException("Insufficient factors at " + mN);
        }
      }
    }
  }
}
