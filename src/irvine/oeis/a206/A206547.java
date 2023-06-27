package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206547 Positive odd numbers relatively prime to 21.
 * @author Sean A. Irvine
 */
public class A206547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206547() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 5, 11, 13, 17, 19, 23, 25, 29, 31, 37, 41, 43});
  }
}
