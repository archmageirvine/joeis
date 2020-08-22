package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173736 (10^n+35)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173736() {
    super(new long[] {-10, 11}, new long[] {5, 15});
  }
}
