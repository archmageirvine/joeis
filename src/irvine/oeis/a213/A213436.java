package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213436 Principal diagonal of the convolution array A212891.
 * @author Sean A. Irvine
 */
public class A213436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213436() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 17, 84, 260, 625});
  }
}
