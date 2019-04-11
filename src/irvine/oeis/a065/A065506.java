package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065506 Number of (binary) bit strings of length n having <code>an</code> even length block of 0's followed by <code>an</code> odd length block of 1's.
 * @author Sean A. Irvine
 */
public class A065506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065506() {
    super(new long[] {-2, -5, 3, 2}, new long[] {1, 2, 7, 15});
  }
}
