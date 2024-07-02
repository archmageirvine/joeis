package irvine.oeis.a374;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A374083 Vertical moments of inertia of a unit lozenge tiling of the hexagon with side lengths n (see references for exact configuration).
 * @author Sean A. Irvine
 */
public class A374083 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(4).multiply(7).subtract(mN * mN).divide(6);
  }
}
