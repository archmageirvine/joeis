package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074034 Number of degree-n irreducible polynomials over GF(4) with trace 1 and subtrace 1.
 * @author Sean A. Irvine
 */
public class A074034 extends A074033 {

  private int mN = 0;

  @Override
  public Z next() {
    return h(++mN, 1);
  }
}
