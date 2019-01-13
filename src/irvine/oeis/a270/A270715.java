package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270715.
 * @author Sean A. Irvine
 */
public class A270715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270715() {
    super(new long[] {-1, 0, 0, 2}, new long[] {1, 3, 5, 10});
  }
}
