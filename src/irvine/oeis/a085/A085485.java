package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085485 First row of symmetric square table A085484, in which the main diagonal is equal to the first row shift left.
 * @author Sean A. Irvine
 */
public class A085485 extends A085484 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}
