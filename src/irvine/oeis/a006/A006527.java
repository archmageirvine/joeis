package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006527 a(n) = (n^3 + 2*n)/3.
 * @author Sean A. Irvine
 */
public class A006527 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).add(mN.multiply2()).divide(3);
  }
}
