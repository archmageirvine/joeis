package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276647.
 * @author Sean A. Irvine
 */
public class A276647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276647() {
    super(new long[] {-2, 6, -5, -1, 3}, new long[] {1, 3, 7, 15, 31});
  }
}
