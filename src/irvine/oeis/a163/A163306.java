package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163306.
 * @author Sean A. Irvine
 */
public class A163306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163306() {
    super(new long[] {-31, 12}, new long[] {1, 7});
  }
}
