package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006001.
 * @author Sean A. Irvine
 */
public class A006001 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().add(5).multiply(mN).add(2).divide2();
  }
}
