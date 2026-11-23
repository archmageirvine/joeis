package irvine.oeis.a266;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a212.A212084;

/**
 * A266972 Triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows: row n gives the coefficients of the chromatic polynomial of the (n,2)-Tur\u00e1n graph, highest powers first.
 * @author Gregory Morse
 */
public class A266972 extends A212084 {
  /** Construct the sequence. */
  public A266972() {
    super(1);
  }

  @Override
  protected Polynomial<Z> counts(final int n) {
    return RING.multiply(block(n / 2), block((n + 1) / 2));
  }
}
