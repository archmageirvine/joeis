package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143769.
 * @author Sean A. Irvine
 */
public class A143769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143769() {
    super(new long[] {-3, -3, -1}, new long[] {-3, 0, 27});
  }
}
