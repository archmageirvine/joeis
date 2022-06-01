package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114724 Each term is the sum of the next two digits.
 * @author Sean A. Irvine
 */
public class A114724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114724() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {2, 11, 6, 5, 14, 9, 5, 4, 13, 8, 5, 3});
  }
}
