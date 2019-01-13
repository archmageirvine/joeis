package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153783.
 * @author Sean A. Irvine
 */
public class A153783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153783() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 33});
  }
}
