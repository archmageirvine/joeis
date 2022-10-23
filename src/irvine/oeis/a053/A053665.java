package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A053665 Smallest number m such that m = j^2 (mod prime(j)) for 1 &lt;= j &lt;= n.
 * @author Sean A. Irvine
 */
public class A053665 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;
  private Z mB = Z.SIX;
  private int mN = 0;
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mP);
    mA = ZUtils.chineseRemainderTheorem(new Z[] {mA, Z.valueOf(mN).square()}, new Z[] {mB, mP});
    mB = mB.multiply(mP);
    return mA;
  }
}
