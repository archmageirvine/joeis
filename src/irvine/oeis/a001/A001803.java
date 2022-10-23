package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001803 Numerators in expansion of (1 - x)^(-3/2).
 * @author Sean A. Irvine
 */
public class A001803 extends Sequence0 {

  private long mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mA = mA.multiply(new Q(mN, mN + 1));
    }
    return mA.den();
  }
}
