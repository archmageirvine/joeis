package irvine.oeis.a186;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A186695 A Galton triangle: T(n,k) = (2k-1)*(T(n-1,k) + T(n-1,k-1)): a type B analog of the ordered Bell numbers A019538.
 * @author Georg Fischer
 */
public class A186695 extends Triangle {

  /** Construct the sequence. */
  public A186695() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 ? Z.ONE : get(n - 2, k - 2).add(get(n - 2, k - 1)).multiply(2 * k - 1);
  }
}
