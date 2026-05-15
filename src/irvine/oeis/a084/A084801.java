package irvine.oeis.a084;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084801 Least positive integers, all distinct, that satisfy Sum_{n&gt;0} 1/a(n)^z = 0, where z=(12+I*5)/13.
 * @author Sean A. Irvine
 */
public class A084801 extends Sequence1 {

  private static final ComputableComplexField F = ComputableComplexField.SINGLETON;
  private static final CC X = new CC(CR.valueOf(new Q(12, 13)), CR.valueOf(new Q(5, 13)));
  private CC mS = CC.ZERO;
  private CR mW = CR.ONE;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(1);
    if (!mA.isOne()) {
      while (F.abs(F.add(F.exp(F.multiply(X, CR.valueOf(mA).log().negate())), mS)).compareTo(mW) > 0) {
        mA = mA.add(1);
      }
    }
    mS = F.add(mS, F.exp(F.multiply(X, CR.valueOf(mA).log().negate())));
    mW = F.abs(mS);
    return mA;
  }
}
