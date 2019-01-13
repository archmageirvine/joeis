package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033305.
 * @author Sean A. Irvine
 */
public class A033305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033305() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {1, 0, 1, 2, 4});
  }
}
