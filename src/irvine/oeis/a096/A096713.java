package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.oeis.a104.A104556;

/**
 * A096713 Irregular triangle T(n,k) of nonzero coefficients of the modified Hermite polynomials (n &gt;= 0 and 0 &lt;= k &lt;= floor(n/2)).
 * @author Georg Fischer
 */
public class A096713 extends A104556 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    Z result = super.next();
    while (result.isZero()) {
      result = super.next();
    }
    return result;
  }
}
