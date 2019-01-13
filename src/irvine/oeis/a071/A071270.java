package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071270.
 * @author Sean A. Irvine
 */
public class A071270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071270() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 12, 57, 176});
  }
}
