package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005998 Number of paraffins.
 * @author Sean A. Irvine
 */
public class A005998 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().subtract(2).multiply(mN).add(5).multiply(mN).signedAdd(mN.isOdd(), mN.add(1)).add(1).divide(8);
  }
}

