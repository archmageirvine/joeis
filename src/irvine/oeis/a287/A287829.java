package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287829 Number of sequences over the alphabet {0,1,...,9} such that no two consecutive terms have distance 6.
 * @author Sean A. Irvine
 */
public class A287829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287829() {
    super(new long[] {2, 9}, new long[] {1, 10});
  }
}
