package irvine.oeis.a101;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A101468 Triangle read by rows: T(n,k)=(n+1-k)*(3*k+1).
 * @author Georg Fischer
 */
public class A101468 extends Triangle {

  /** Construct the sequence. */
  public A101468() {
    setOffset(0);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n + 1 - k).multiply(3L * k + 1);
  }
}
