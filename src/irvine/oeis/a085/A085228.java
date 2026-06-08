package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085228 Diagonal of array A085205.
 * @author Sean A. Irvine
 */
public class A085228 extends A085205 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
