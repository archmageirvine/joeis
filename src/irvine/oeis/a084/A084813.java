package irvine.oeis.a084;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084813 Lexically least ascending sequence of positive integers such that |Sum_{k=1..n} 1/a(k)^z| is monotonically decreasing, with z=i.
 * @author Sean A. Irvine
 */
public class A084813 extends Sequence1 {

  private static final ComputableComplexField F = ComputableComplexField.SINGLETON;
  private CC mS = CC.ZERO;
  private CR mW = CR.ONE;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(1);
    if (!mA.isOne()) {
      while (F.abs(F.add(F.exp(F.multiply(CC.I, CR.valueOf(mA).log().negate())), mS)).compareTo(mW) > 0) {
        mA = mA.add(1);
      }
    }
    mS = F.add(mS, F.exp(F.multiply(CC.I, CR.valueOf(mA).log().negate())));
    mW = F.abs(mS);
    return mA;
  }
}
