package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258440.
 * @author Sean A. Irvine
 */
public class A258440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258440() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {3, 11, 25, 49, 84, 132, 196});
  }
}
