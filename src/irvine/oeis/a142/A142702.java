package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142702 Period 4: repeat [5, 2, 5, 8].
 * @author Sean A. Irvine
 */
public class A142702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142702() {
    super(new long[] {1, -1, 1}, new long[] {5, 2, 5});
  }
}
