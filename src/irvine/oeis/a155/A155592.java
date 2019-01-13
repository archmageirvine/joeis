package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155592.
 * @author Sean A. Irvine
 */
public class A155592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155592() {
    super(new long[] {16, -26, 11}, new long[] {1, 9, 67});
  }
}
