package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287816 Number of nonary sequences of length n such that no two consecutive terms have distance 1.
 * @author Sean A. Irvine
 */
public class A287816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287816() {
    super(new long[] {1, 19, -15, -11, 9}, new long[] {1, 9, 65, 471, 3413});
  }
}
