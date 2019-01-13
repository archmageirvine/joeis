package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006007.
 * @author Sean A. Irvine
 */
public class A006007 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(2).multiply(mN).add(5).multiply(mN).add(4).multiply(mN).divide(12);
  }
}

