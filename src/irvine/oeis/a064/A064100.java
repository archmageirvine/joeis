package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064100 a(n) = (100^n - 1)/99*n.
 * @author Sean A. Irvine
 */
public class A064100 extends Sequence1 {

  private Z mT = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mT = mT.multiply(100);
    return mT.subtract(1).multiply(++mN).divide(99);
  }
}
