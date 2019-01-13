package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005911.
 * @author Sean A. Irvine
 */
public class A005911 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : mN.square().multiply(46).add(2);
  }
}
