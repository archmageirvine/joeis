package irvine.oeis.a095;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A095896 Triangle read by rows: T(n,k) = n^(n-k+1), n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A095896 extends Triangle {

  /** Construct the sequence. */
  public A095896() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n + 1).pow(n - k + 1);
  }
}
