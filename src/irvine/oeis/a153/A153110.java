package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153110 Period 6: repeat [1, 5, 7, 2, 4, 8].
 * @author Sean A. Irvine
 */
public class A153110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153110() {
    super(new long[] {1, 1, 0, -1}, new long[] {1, 5, 7, 2});
  }
}
