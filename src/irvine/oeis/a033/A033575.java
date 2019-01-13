package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033575.
 * @author Sean A. Irvine
 */
public class A033575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033575() {
    super(new long[] {1, -3, 3}, new long[] {1, 36, 115});
  }
}
