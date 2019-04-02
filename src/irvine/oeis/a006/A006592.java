package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006592 a(n) = 10*n^3 - 6*n^2.
 * @author Sean A. Irvine
 */
public class A006592 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(10).subtract(6).multiply(mN.square());
  }
}
