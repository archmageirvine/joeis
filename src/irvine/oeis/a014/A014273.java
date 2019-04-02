package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A014273 Number of trees on n nodes with forbidden limbs.
 * @author Sean A. Irvine
 */
public class A014273 extends A014271 {

  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 0, -2, 1);

  @Override
  protected Polynomial<Z> numerator() {
    return NUM;
  }
}

