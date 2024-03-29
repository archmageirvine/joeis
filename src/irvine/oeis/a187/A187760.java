package irvine.oeis.a187;
// Generated by gen_seq4.pl trisimple/trisimard at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A187760 Table T(n,k) read by antidiagonals. T(n,k)=n-k+1, if n&gt;=k, T(n,k)=k-n+2, if n &lt; k.
 * @author Georg Fischer
 */
public class A187760 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A187760() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n >= k ? n - k + 1 : k - n + 2);
  }
}
