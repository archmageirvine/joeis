package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024442.
 * @author Sean A. Irvine
 */
public class A024442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024442() {
    super(new long[] {-693, 932, -266, 28}, new long[] {1, 28, 518, 7988});
  }
}
