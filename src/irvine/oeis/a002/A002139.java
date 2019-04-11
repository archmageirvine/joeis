package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.math.z.Euler;

/**
 * A002139 Shuffling <code>2n</code> cards.
 * @author Sean A. Irvine
 */
public class A002139 extends A002326 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = super.next();
    if (!mN.equals(Z.ONE) && ZUtils.testPrimitiveRoot(Z.TWO, mN)) {
      if (mPrime.isPrime(mN)) {
        return f.add(1);
      }
      // 2n-1 must have the form q^k, k>1
      final Z q = mN.isPower();
      return f.add(1).multiply(Euler.phi(mN.divide(q)));
    } else {
      return f.lcm(f.add(1));
    }
  }
}
