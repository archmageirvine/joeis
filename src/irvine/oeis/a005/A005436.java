package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005436 Number of convex polygons of perimeter <code>2n</code> on square lattice.
 * @author Sean A. Irvine
 */
public class A005436 implements Sequence {

  private int mN = -3;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.valueOf(mN + 3);
    }
    return Z.ONE.shiftLeft(2 * mN).multiply(2L * mN + 11).subtract(Binomial.binomial(2 * mN, mN).multiply(2L * mN + 1).multiply(4));
  }
}

