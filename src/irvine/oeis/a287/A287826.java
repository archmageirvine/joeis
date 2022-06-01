package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287826 Number of sequences over the alphabet {0,1,...,9} such that no two consecutive terms have distance 2.
 * @author Sean A. Irvine
 */
public class A287826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287826() {
    super(new long[] {-2, -13, 10}, new long[] {1, 10, 84});
  }
}
