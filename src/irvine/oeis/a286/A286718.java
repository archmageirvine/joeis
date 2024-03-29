package irvine.oeis.a286;
// Generated by gen_seq4.pl trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A286718 Triangle read by rows: T(n, k) is the Sheffer triangle ((1 - 3*x)^(-1/3), (-1/3)*log(1 - 3*x)). A generalized Stirling1 triangle.
 * @author Georg Fischer
 */
public class A286718 extends Triangle {

  /** Construct the sequence. */
  public A286718() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k).multiply(3L * n - 2));
  }
}
