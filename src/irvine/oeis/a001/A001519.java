package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001519.
 * @author Sean A. Irvine
 */
public class A001519 implements Sequence {

  private Z mA = Z.FIVE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    final Z t = mB.multiply(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
