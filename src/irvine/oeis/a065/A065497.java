package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065497 Number of (binary) bit strings of length n having at least one even length block of 0's followed by an even length block of 1's.
 * @author Sean A. Irvine
 */
public class A065497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065497() {
    super(new long[] {2, -5, -4, 3, 2}, new long[] {1, 2, 7, 16, 40});
  }
}
