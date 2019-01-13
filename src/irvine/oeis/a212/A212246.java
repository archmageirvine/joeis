package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212246.
 * @author Sean A. Irvine
 */
public class A212246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212246() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 4, 21, 65});
  }
}
