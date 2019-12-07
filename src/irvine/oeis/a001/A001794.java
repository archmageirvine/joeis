package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001794 Negated coefficients of Chebyshev T polynomials: <code>[x^n](-T(n+6, x)), n &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A001794 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 1).multiply(mN + 2).multiply(mN + 6).divide(3).shiftLeft(mN - 2);
  }
}
