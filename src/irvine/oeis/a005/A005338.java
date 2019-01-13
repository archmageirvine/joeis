package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005338.
 * @author Sean A. Irvine
 */
public class A005338 implements Sequence {

  private Z mN = Z.SEVEN;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.EIGHT.equals(mN)) {
      return Z.ONE;
    } else if (Z.NINE.equals(mN)) {
      return Z.EIGHT;
    }
    return mN.add(10).multiply(mN).subtract(445).multiply(mN).add(2690).multiply(mN).subtract(1656).divide(24);
  }
}

