package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006000.
 * @author Sean A. Irvine
 */
public class A006000 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(2).multiply(mN).add(3).multiply(mN).add(2).divide2();
  }
}

