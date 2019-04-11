package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001805 <code>a(n) = n! *</code> binomial(n,3).
 * @author Sean A. Irvine
 */
public class A001805 implements Sequence {

  private long mN = 2;
  private Z mA = Z.SIX;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 3);
    }
    return mA;
  }
}
