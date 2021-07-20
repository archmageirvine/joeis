package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A002946 Continued fraction for cube root of 3.
 * @author Sean A. Irvine
 */
public class A002946 extends A002945 {

  @Override
  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-3, 0, 0, 1);
  }
}
