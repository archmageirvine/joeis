package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A014271 Number of trees on n nodes with forbidden limbs.
 * @author Sean A. Irvine
 */
public class A014271 extends A014267 {

  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 0, -2, 0, 1);

  @Override
  protected int mul() {
    return 2;
  }

  @Override
  protected Polynomial<Z> numerator() {
    return NUM;
  }
}

