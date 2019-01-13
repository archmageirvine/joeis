package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102081.
 * @author Sean A. Irvine
 */
public class A102081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102081() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 5, 4, 9});
  }
}
