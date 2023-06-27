package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245019 Number of ordered n-tuples of positive integers, whose minimum is 0 and maximum is 4.
 * @author Sean A. Irvine
 */
public class A245019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245019() {
    super(1, new long[] {60, -47, 12}, new long[] {0, 2, 24});
  }
}
