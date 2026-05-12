package irvine.oeis.a084;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084819 Least integers that satisfy Sum_{n&gt;=1} 1/a(n)^z = 0, where a(1)=1, a(n+1) &gt; a(n) and z = i*Pi/(4*log(2)).
 * @author Sean A. Irvine
 */
public class A084819 extends Sequence1 {

  private static final ComputableComplexField F = ComputableComplexField.SINGLETON;
  private static final CC X = new CC(CR.ZERO, CR.PI.divide(CR.LOG2.multiply(4)));
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
