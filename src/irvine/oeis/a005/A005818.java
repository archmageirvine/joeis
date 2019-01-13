package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005818.
 * @author Sean A. Irvine
 */
public class A005818 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    if (Z.FIVE.equals(mN)) {
      mN = mN.add(2);
    }
    return mN;
  }
}
