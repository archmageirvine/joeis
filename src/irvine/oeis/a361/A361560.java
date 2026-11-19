package irvine.oeis.a361;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A361560 Number of labeled digraphs on [n] all of whose strongly connected components are complete digraphs.
 * @author Gregory Morse
 */
public class A361560 extends A361455 {
  private int mN = -1;

  @Override
  protected Polynomial<Z> component(final int n) {
    return RING.one();
  }

  @Override
  public Z next() {
    return row(++mN).coeff(0);
  }
}
