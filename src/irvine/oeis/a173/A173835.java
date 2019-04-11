package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173835 <code>10^n+2*n</code>.
 * @author Sean A. Irvine
 */
public class A173835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173835() {
    super(new long[] {10, -21, 12}, new long[] {1, 12, 104});
  }
}
