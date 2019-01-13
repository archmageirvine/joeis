package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006004.
 * @author Sean A. Irvine
 */
public class A006004 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.subtract(2).multiply(mN).add(5).multiply(mN).subtract(2).divide2();
  }
}

