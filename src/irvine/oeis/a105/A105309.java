package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105309.
 * @author Sean A. Irvine
 */
public class A105309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105309() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 1, 2, 5});
  }
}
