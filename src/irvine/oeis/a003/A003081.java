package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003081 Number of triangular cacti with <code>2n+1</code> nodes <code>(n triangles)</code>.
 * @author Sean A. Irvine
 */
public class A003081 extends A003080 {

  @Override
  public Z next() {
    super.next();
    return A003080.RING.add(mB, RING.divide(RING.subtract(mB.substitutePower(3, mN), RING.pow(mB, 3)), Z.THREE)).coeff(mN);
  }
}

