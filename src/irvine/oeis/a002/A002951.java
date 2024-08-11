package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A002951 Continued fraction for fifth root of 5.
 * @author Sean A. Irvine
 */
public class A002951 extends A002945 {

  {
    setOffset(0);
  }

  @Override
  protected Polynomial<Z> initialPoly() {
    return Polynomial.create(-5, 0, 0, 0, 0, 1);
  }
}
