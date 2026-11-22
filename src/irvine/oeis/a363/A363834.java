package irvine.oeis.a363;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a361.A361455;

/**
 * A363834 Number of labeled digraphs (with self loops allowed) on [n] such that every strongly connected component of size at least 2 contains a vertex with a self loop.
 * @author Gregory Morse
 */
public class A363834 extends A361455 {
  private int mN = -1;

  protected Z choices(final int n) {
    return n == 1 ? Z.TWO : Z.ONE.shiftLeft(n).subtract(1).multiply(strong(n));
  }

  @Override
  protected Polynomial<Z> component(final int n) {
    return RING.monomial(choices(n), 1);
  }

  @Override
  public Z next() {
    return RING.eval(row(++mN), Z.ONE);
  }
}
