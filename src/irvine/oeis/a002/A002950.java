package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.polynomial.Polynomial;

/**
 * A002950 Continued fraction for fifth root of 2.
 * @author Sean A. Irvine
 */
public class A002950 extends A002945 {

  @Override
  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-2, 0, 0, 0, 0, 1);
  }
}
