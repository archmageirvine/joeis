package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A014278 Number of trees on n nodes with 3 forbidden limbs of size 4, 5 and 6.
 * @author Sean A. Irvine
 */
public class A014278 extends A014267 {

  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 0, 0, -1, -1, -1, 2);

  @Override
  protected Polynomial<Z> numerator() {
    return NUM;
  }
}

