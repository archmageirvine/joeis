package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a074.A074031;

/**
 * A054661 Number of monic irreducible polynomials over GF(4) with zero trace.
 * @author Sean A. Irvine
 */
public class A054661 extends A074031 {

  private int mN = 0;

  @Override
  public Z next() {
    return h(++mN, 0).add(h(mN, 1).multiply(3));
  }
}
