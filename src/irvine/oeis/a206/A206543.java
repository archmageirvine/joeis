package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206543 Period 10: repeat 1, 3, 5, 7, 9, 9, 7, 5, 3, 1.
 * @author Sean A. Irvine
 */
public class A206543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206543() {
    super(new long[] {1, -2, 2, -2, 2}, new long[] {1, 3, 5, 7, 9});
  }
}
