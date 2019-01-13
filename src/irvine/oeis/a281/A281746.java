package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281746.
 * @author Sean A. Irvine
 */
public class A281746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281746() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 3, 5, 6, 9, 10, 12, 15});
  }
}
