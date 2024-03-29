package irvine.oeis.a176;
// Generated by gen_seq4.pl triman/trian at 2021-10-31 22:17

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A176224 A symmetrical triangle sequence: T(n, k) = q^k + q^(n-k) - q^n, with q=2.
 * @author Georg Fischer
 */
public class A176224 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return Z.ONE.shiftLeft(k).add(Z.ONE.shiftLeft(n - k)).subtract(Z.ONE.shiftLeft(n));
  }
}
