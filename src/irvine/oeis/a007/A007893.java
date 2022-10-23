package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007893 A Kutz sequence.
 * @author Sean A. Irvine
 */
public class A007893 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(mN.divide(5).multiply(4)).square();
  }
}
