package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085226 Row 0 of A085205.
 * @author Sean A. Irvine
 */
public class A085226 extends A085205 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 0);
  }
}
