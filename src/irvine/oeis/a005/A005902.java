package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005902 Centered icosahedral (or cuboctahedral) numbers, also crystal ball sequence for f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A005902 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(5).add(5).multiply(mN).add(3).multiply(mN.multiply2().add(1)).divide(3);
  }
}
