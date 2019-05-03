package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065455 Number of (binary) bit strings of length n in which no even block of <code>0</code>'s is followed by an odd block of <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A065455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065455() {
    super(new long[] {1, 3, 0}, new long[] {1, 2, 4});
  }
}
