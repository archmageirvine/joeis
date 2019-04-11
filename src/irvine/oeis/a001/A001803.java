package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001803 Numerators in expansion of <code>(1 - x)^(-3/2)</code>.
 * @author Sean A. Irvine
 */
public class A001803 implements Sequence {

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
