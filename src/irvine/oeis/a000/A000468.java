package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000468 Powers of ten written in base 8.
 * @author Sean A. Irvine
 */
public class A000468 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
    } else {
      mN = mN.multiply(10);
    }
    return new Z(mN.toString(8));
  }
}
