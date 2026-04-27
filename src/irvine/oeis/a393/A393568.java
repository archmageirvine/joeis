package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393568 a(1)=1; for n &gt;= 1, a(n+1) = prime(k) where k &gt; a(n) is least k such that prime(k) + k is prime.
 * @author Sean A. Irvine
 */
public class A393568 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mP = Z.ONE;
  private long mK = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (true) {
        ++mK;
        mP = mPrime.nextPrime(mP);
        if (mA.compareTo(mK) < 0 && mP.add(mK).isProbablePrime()) {
          mA = mP;
          break;
        }
      }
    }
    return mA;
  }
}
