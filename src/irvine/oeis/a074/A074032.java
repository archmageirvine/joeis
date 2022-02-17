package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074032 Number of degree-n irreducible polynomials over GF(4) with trace 0 and subtrace 1.
 * @author Sean A. Irvine
 */
public class A074032 extends A074031 {

  private int mN = 0;

  @Override
  public Z next() {
    return h(++mN, 1);
  }
}
