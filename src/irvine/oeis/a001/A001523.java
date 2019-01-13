package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001523.
 * @author Sean A. Irvine
 */
public class A001523 extends A001522 {

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return RING.coeff(sum(mN), RING.pow(prod(mN), 2, mN), mN);
  }
}
