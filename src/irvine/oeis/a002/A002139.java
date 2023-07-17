package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * A002139 Shuffling 2n cards.
 * @author Sean A. Irvine
 */
public class A002139 extends A002326 {

  /** Construct the sequence. */
  public A002139() {
    super(1);
  }

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = super.next();
    if (!mN.equals(Z.ONE) && ZUtils.isPrimitiveRoot(Z.TWO, mN)) {
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
