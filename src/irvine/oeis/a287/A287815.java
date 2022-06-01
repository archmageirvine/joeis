package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287815 Number of octonary sequences of length n such that no two consecutive terms have distance 7.
 * @author Sean A. Irvine
 */
public class A287815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287815() {
    super(new long[] {6, 7}, new long[] {1, 8});
  }
}
