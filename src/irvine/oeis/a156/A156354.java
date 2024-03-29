package irvine.oeis.a156;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A156354 Triangle T(n, k) = k^(n-k) + (n-k)^k with T(0, 0) = 1, read by rows.
 * @author Georg Fischer
 */
public class A156354 extends Triangle {

  /** Construct the sequence. */
  public A156354() {
    setOffset(0);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 && k == 0 ? Z.ONE : Z.valueOf(k).pow(n - k).add(Z.valueOf(n - k).pow(k));
  }
}
