package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206547.
 * @author Sean A. Irvine
 */
public class A206547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206547() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 5, 11, 13, 17, 19, 23, 25, 29, 31, 37, 41, 43});
  }
}
