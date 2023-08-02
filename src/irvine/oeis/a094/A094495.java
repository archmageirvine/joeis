package irvine.oeis.a094;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A094495 Table of binomial coefficients mod m^2, read by rows: T(m, n) = binomial(m, n) mod m^2.
 * @author Georg Fischer
 */
public class A094495 extends Triangle {

  @Override
  public Z next() {
    return super.next().mod(mRow == 0 ? Z.ONE : Z.valueOf((long) mRow * mRow));
  }
}
