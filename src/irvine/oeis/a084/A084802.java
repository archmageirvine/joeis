package irvine.oeis.a084;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084802 Least positive integers, all distinct, that satisfy sum(n&gt;0,1/a(n)^z)=0, where z=(24+i*7)/25.
 * @author Sean A. Irvine
 */
public class A084802 extends Sequence1 {

  private static final ComputableComplexField F = ComputableComplexField.SINGLETON;
  private static final CC X = new CC(CR.valueOf(new Q(24, 25)), CR.valueOf(new Q(7, 25)));
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
