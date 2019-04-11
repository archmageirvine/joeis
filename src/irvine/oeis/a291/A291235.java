package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291235 p-INVERT of <code>(0,1,0,1,0,1,</code>...), where p(S) <code>= 1 -</code> S - S^2 - S^3 - S^4 - S^5.
 * @author Sean A. Irvine
 */
public class A291235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291235() {
    super(new long[] {1, 1, -6, -3, 12, 5, -12, -3, 6, 1}, new long[] {1, 2, 5, 12, 29, 69, 166, 394, 944, 2245});
  }
}
