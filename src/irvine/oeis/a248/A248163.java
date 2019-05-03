package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248163 Chebyshev's S polynomials <code>(A049310)</code> evaluated at 34/3 and multiplied by powers of <code>3 (A000244)</code>.
 * @author Sean A. Irvine
 */
public class A248163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248163() {
    super(new long[] {-9, 34}, new long[] {1, 34});
  }
}
