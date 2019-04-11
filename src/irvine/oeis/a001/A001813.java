package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001813 Quadruple factorial numbers: <code>a(n) = (2n)!/n!</code>.
 * @author Sean A. Irvine
 */
public class A001813 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(2 * mN).multiply(2 * mN - 1).divide(mN);
    }
    return mA;
  }
}
