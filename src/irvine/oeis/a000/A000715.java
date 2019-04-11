package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000715 Number of partitions of <code>n,</code> with three kinds of 1,2 and 3 and two kinds of <code>4,5,6,...</code>.
 * @author Sean A. Irvine
 */
public class A000715 extends A000711 {

  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 0, 1, 1, -1);

  @Override
  protected Polynomial<Z> den() {
    return DEN;
  }
}
