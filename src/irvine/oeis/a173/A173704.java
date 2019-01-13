package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173704.
 * @author Sean A. Irvine
 */
public class A173704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173704() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 0, 4, 17, 49, 111});
  }
}
