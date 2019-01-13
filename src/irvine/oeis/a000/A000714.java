package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000714.
 * @author Sean A. Irvine
 */
public class A000714 extends A000711 {

  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 1);

  @Override
  protected Polynomial<Z> den() {
    return DEN;
  }
}
