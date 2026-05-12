package irvine.oeis.a084;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084816 Least integers that satisfy sum(n&gt;0,1/a(n)^z)=0, where a(1)=1, a(n+1)&gt;a(n) and z=I*2.
 * @author Sean A. Irvine
 */
public class A084816 extends Sequence1 {

  private static final ComputableComplexField F = ComputableComplexField.SINGLETON;
  private static final CC X = new CC(CR.ZERO, CR.TWO);
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
