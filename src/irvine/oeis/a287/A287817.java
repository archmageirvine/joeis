package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287817 Number of nonary sequences of length n such that no two consecutive terms have distance 2.
 * @author Sean A. Irvine
 */
public class A287817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287817() {
    super(new long[] {1, 10, -23, -1, 8}, new long[] {1, 9, 67, 501, 3747});
  }
}
