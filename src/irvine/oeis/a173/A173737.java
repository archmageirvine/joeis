package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173737 (10^n+44)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173737() {
    super(new long[] {-10, 11}, new long[] {6, 16});
  }
}
