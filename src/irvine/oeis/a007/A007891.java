package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007891.
 * @author Sean A. Irvine
 */
public class A007891 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(mN.divide(3).multiply2()).square();
  }
}
