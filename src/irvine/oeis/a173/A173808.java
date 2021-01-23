package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173808 (7*10^n+11)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173808() {
    super(new long[] {-10, 11}, new long[] {9, 79});
  }
}
