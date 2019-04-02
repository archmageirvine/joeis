package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168183 Numbers that are not multiples of 9.
 * @author Sean A. Irvine
 */
public class A168183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168183() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 10});
  }
}
