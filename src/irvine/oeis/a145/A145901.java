package irvine.oeis.a145;
// Generated by gen_seq4.pl A225466/trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A145901 Triangle of f-vectors of the simplicial complexes dual to the permutohedra of type B_n.
 * @author Georg Fischer
 */
public class A145901 extends Triangle {

  /** Construct the sequence. */
  public A145901() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).multiply(2L * k).add(get(n - 1, k).multiply(2L * k + 1));
  }
}
