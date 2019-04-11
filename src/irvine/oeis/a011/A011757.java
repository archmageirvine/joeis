package irvine.oeis.a011;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A011757 <code>a(n) =</code> prime(n^2).
 * @author Sean A. Irvine
 */
public class A011757 extends A000290 {

  {
    super.next();
  }

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z t = super.next();
    while (!mN.equals(t)) {
      mP = mPrime.nextPrime(mP);
      mN = mN.add(1);
    }
    return mP;
  }
}
