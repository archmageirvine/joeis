package irvine.oeis.a026;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A026428 <code>a(n) =</code> position of n-th prime in <code>A026416</code>.
 * @author Sean A. Irvine
 */
public class A026428 extends A026416 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mM = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z t;
    do {
      t = super.next();
      ++mM;
    } while (!t.equals(mP));
    return Z.valueOf(mM);
  }
}
