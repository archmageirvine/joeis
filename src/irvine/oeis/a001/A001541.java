package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001541.
 * @author Sean A. Irvine
 */
public class A001541 implements Sequence {

  private Z mA = Z.valueOf(17);
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    final Z t = mB.multiply(6).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
