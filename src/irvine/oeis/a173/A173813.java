package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173813 2*(10^n-5), n&gt;0.
 * @author Sean A. Irvine
 */
public class A173813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173813() {
    super(new long[] {-10, 11}, new long[] {10, 190});
  }
}
