package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001804 <code>a(n) = n! *</code> C(n,2).
 * @author Sean A. Irvine
 */
public class A001804 implements Sequence {

  private long mN = 1;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(Z.valueOf(mN).square()).divide(mN - 2);
    }
    return mA;
  }
}
