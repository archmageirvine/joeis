package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A002948 Continued fraction for cube root of 5.
 * @author Sean A. Irvine
 */
public class A002948 extends A002945 {

  @Override
  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-5, 0, 0, 1);
  }
}
