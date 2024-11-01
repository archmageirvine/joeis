package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a037.A037904;

/**
 * A072701.
 * @author Sean A. Irvine
 */
public class A072830 extends A037904 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN += 9;
    mSum = mSum.add(super.next());
    return mSum.multiply2().subtract(mN).abs();
  }
}
