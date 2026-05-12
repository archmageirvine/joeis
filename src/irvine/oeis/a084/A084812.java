package irvine.oeis.a084;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084812 a(1)=1; for n &gt;= 2, choose a(n) so that |Sum_{k=1..n} 1/a(k)^z| &lt; |Sum_{k=1..n-1} 1/a(k)^z|, where z = 1/2 + i*2*Pi.
 * @author Sean A. Irvine
 */
public class A084812 extends Sequence1 {

  private static final ComputableComplexField F = ComputableComplexField.SINGLETON;
  private static final CC X = new CC(CR.HALF, CR.TAU);
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
