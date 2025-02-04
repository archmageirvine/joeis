package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074937 Let c(1) = c(2) = 1, c(n+2) = 1/(c(n+1)+c(n)); then a(n) = (1+sign(c(n)-sqrt(1/2)))/2.
 * @author Sean A. Irvine
 */
public class A074937 extends Sequence1 {

  private static final CR INV_SQRT2 = CR.SQRT2.inverse();
  private Q mA = null;
  private Q mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ONE;
      } else {
        mB = Q.ONE;
      }
      return Z.ONE;
    }
    final Q t = mA.add(mB).reciprocal();
    mA = mB;
    mB = t;
    return Z.valueOf((CR.valueOf(t).subtract(INV_SQRT2).signum() + 1) / 2);
  }
}
