package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006974 Coefficients of Chebyshev T polynomials: a(n) = A053120(n+8, n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A006974 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2).multiply(mN + 7).divide(3).shiftLeft(mN - 5);
  }
}
