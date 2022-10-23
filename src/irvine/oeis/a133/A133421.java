package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A133421 Image of n under one application of the "7x+1" map.
 * @author Sean A. Irvine
 */
public class A133421 extends Sequence1 {

  private Z mN = Z.ZERO;

  static Z step(final Z n) {
    if (n.isEven()) {
      return n.divide2();
    }
    if (n.mod(3) == 0) {
      return n.divide(3);
    }
    if (n.mod(5) == 0) {
      return n.divide(5);
    }
    return n.multiply(7).add(1);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return step(mN);
  }
}

