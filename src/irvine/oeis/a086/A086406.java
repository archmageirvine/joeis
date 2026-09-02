package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086406 Main diagonal of number array A086404.
 * @author Sean A. Irvine
 */
public class A086406 extends A086404 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}

