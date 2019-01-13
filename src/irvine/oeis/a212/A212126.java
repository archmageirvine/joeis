package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212126.
 * @author Sean A. Irvine
 */
public class A212126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212126() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1});
  }
}
