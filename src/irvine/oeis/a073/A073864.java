package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073864 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mM = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    Z p = mM;
    mM = mM.multiply(10);
    if (++mN % 3 == 0) {
      return Z.ZERO;
    }
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.compareTo(mM) >= 0) {
        return Z.ZERO;
      }
      if (Functions.DIGIT_SUM.l(p) == mN) {
        return p;
      }
    }
  }
}
