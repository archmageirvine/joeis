package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014309.
 * @author Sean A. Irvine
 */
public class A014309 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(5).multiply(mN).subtract(18).multiply(mN).multiply(mN.add(1)).divide(24);
  }
}

