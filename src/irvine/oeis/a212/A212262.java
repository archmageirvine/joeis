package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212262.
 * @author Sean A. Irvine
 */
public class A212262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212262() {
    super(new long[] {-3, -2, 4}, new long[] {1, 4, 10});
  }
}
