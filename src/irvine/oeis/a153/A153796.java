package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153796.
 * @author Sean A. Irvine
 */
public class A153796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153796() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 48});
  }
}
