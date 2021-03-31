package irvine.oeis.a045;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045976 A product related to n-th roots of 1.
 * @author Sean A. Irvine
 */
public class A045976 implements Sequence {

  private static final ComputableComplexField CCF = ComputableComplexField.SINGLETON;
  private static final CC TAU_I = CCF.multiply(CC.I, CR.TAU);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    CC prod = CC.ONE;
    for (int k = 1; k < mN; ++k) {
      final CC u = CCF.exp(CCF.multiply(TAU_I, CR.valueOf(new Q(k, mN))));
      final CC t = CCF.pow(CCF.add(u, CC.ONE), mN);
      prod = CCF.multiply(prod, CCF.add(t, CC.ONE));
    }
    return prod.re().toZ();
  }
}
