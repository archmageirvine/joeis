package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A038679 Convolution of A007054 (Super ballot numbers) with A000302 (powers of 4).
 * @author Sean A. Irvine
 */
public class A038679 extends A000108 {

  private Z mT = Z.ONE;
  {
    super.next();
  }

  @Override
  public Z next() {
    mT = mT.multiply(4);
    return mT.subtract(super.next());
  }
}
