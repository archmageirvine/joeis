package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A014280.
 * @author Sean A. Irvine
 */
public class A014280 extends A014267 {

  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 0, 0, -1, -1, -1, 0, 1, 1, 1, 0, 0, -1);

  @Override
  protected Polynomial<Z> numerator() {
    return NUM;
  }
}

