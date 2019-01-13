package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173141.
 * @author Sean A. Irvine
 */
public class A173141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173141() {
    super(new long[] {1, -3, 3}, new long[] {50, 198, 444});
  }
}
