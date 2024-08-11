package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A002947 Continued fraction for cube root of 4.
 * @author Sean A. Irvine
 */
public class A002947 extends A002945 {

  {
    setOffset(0);
  }

  @Override
  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-4, 0, 0, 1);
  }
}
