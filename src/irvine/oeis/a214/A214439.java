package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214439 Denominators of correlation kernels arising in adding a list of numbers in base 3 considering the distribution of number of carries.
 * @author Sean A. Irvine
 */
public class A214439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214439() {
    super(-1, new long[] {-27, 0, 0, 0, 0, 0, 28, 0, 0, 0, 0, 0}, new long[] {3, 3, 9, 9, 27, 1, 81, 81, 243, 243, 729, 1});
  }
}
