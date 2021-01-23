package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152020 Denominator of 8/(9n^2) divided by 9.
 * @author Sean A. Irvine
 */
public class A152020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152020() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 1, 9, 2, 25, 9, 49, 8, 81, 25, 121, 18});
  }
}
