package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291400 p-INVERT of <code>(1,1,0,0,0,0,</code>...), where p(S) <code>= 1 -</code> S^2 - S^4.
 * @author Sean A. Irvine
 */
public class A291400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291400() {
    super(new long[] {1, 4, 6, 4, 2, 2, 1, 0}, new long[] {0, 1, 2, 3, 8, 15, 26, 52});
  }
}
