package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059691 Carryless product 12 X n base 10.
 * @author Sean A. Irvine
 */
public class A059691 extends A059692 {

  private long mN = -1;

  @Override
  public Z next() {
    return nimProduct(10, 12, ++mN);
  }
}

