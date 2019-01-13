package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117910.
 * @author Sean A. Irvine
 */
public class A117910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117910() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 1, 0, 0}, new long[] {1, 1, 1, 1, 2, 1, 2, 3, 2});
  }
}
