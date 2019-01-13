package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083564.
 * @author Sean A. Irvine
 */
public class A083564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083564() {
    super(new long[] {-1, -3, 6, 3}, new long[] {3, 21, 72, 329});
  }
}
