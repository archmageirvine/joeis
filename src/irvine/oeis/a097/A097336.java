package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097336.
 * @author Sean A. Irvine
 */
public class A097336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097336() {
    super(new long[] {16, 0, 1}, new long[] {1, 5, 5});
  }
}
