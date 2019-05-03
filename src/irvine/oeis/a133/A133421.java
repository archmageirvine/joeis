package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A133421 Image of n under one application of the <code>"7x+1"</code> map.
 * @author Sean A. Irvine
 */
public class A133421 implements Sequence {

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

