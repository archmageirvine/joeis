package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129026 <code>a(n) = (1/2)*(n^4 + 11*n^3 + 53*n^2 + 97*n + 54)</code>.
 * @author Sean A. Irvine
 */
public class A129026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129026() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 27, 108, 282, 600});
  }
}
