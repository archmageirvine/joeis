package irvine.oeis.a173;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A173007 Triangle T(n,k) read by rows: coefficient [x^k] of the polynomial Product_{i=1..n} (x + q^i) in row n and q = 3.
 * @author Georg Fischer
 */
public class A173007 extends Triangle {

  /** Construct the sequence. */
  public A173007() {
    hasRAM(false);
  }

  /* T(n,k) = 3^n*T(n-1,k) + T(n-1,k-1), T(0, 0)=1. */
  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k).multiply(Z.THREE.pow(n)));
  }
}
