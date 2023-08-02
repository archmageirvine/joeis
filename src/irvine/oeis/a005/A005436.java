package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A005436 Number of convex polygons of perimeter 2n on square lattice.
 * @author Sean A. Irvine
 */
public class A005436 extends Sequence2 {

  private int mN = -3;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.valueOf(mN + 3);
    }
    return Z.ONE.shiftLeft(2L * mN).multiply(2L * mN + 11).subtract(Binomial.binomial(2L * mN, mN).multiply(2L * mN + 1).multiply(4));
  }
}

