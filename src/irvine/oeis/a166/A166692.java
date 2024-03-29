package irvine.oeis.a166;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A166692 Triangle T(n,k) read by rows: T(n,k) = 2^(k-1), k&gt;0, T(n,0) = (n+1) mod 2.
 * @author Georg Fischer
 */
public class A166692 extends Triangle {

  /** Construct the sequence. */
  public A166692() {
    setOffset(0);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k > 0 ? Z.ONE.shiftLeft(k - 1) : Z.valueOf((n + 1) % 2);
  }
}
