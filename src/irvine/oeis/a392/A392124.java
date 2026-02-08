package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a008.A008303;

/**
 * A392124 Irregular triangular array read by rows: row n shows the coefficients in the expansion of the n-th derivative of tan(x) as a linear combination of products of powers of sec(x)^2 and tan(x).
 * @author Sean A. Irvine
 */
public class A392124 extends A008303 {

  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = (mN + 1) / 2 - 1;
    }
    return get(mN, 0, 1).coeff(mM);
  }
}
