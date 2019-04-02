package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.polynomial.Polynomial;

/**
 * A002949 Continued fraction for cube root of 6.
 * @author Sean A. Irvine
 */
public class A002949 extends A002945 {

  @Override
  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-6, 0, 0, 1);
  }
}
