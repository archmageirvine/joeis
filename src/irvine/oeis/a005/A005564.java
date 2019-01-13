package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005564.
 * @author Sean A. Irvine
 */
public class A005564 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.subtract(2)).divide2();
  }
}
