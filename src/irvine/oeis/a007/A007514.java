package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007514 <code>Pi = Sum_{n &gt;= 0} a(n)/n!</code>.
 * @author Sean A. Irvine
 */
public class A007514 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Z t = mPrev.multiply(mN);
    mPrev = CR.PI.multiply(mF).floor();
    return mPrev.subtract(t);
  }
}
