package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A063940 Composite numbers k such that Ramanujan's function tau(k) (A000594) is not divisible by k.
 * @author Sean A. Irvine
 */
public class A063940 extends A000594 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) != 0 && mN > 1 && !mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
