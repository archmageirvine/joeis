package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214438 Numerator of correlation kernels arising in adding a list of numbers in base 3 considering the distribution of number of carries.
 * @author Sean A. Irvine
 */
public class A214438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214438() {
    super(-1, new long[] {-1, 0, 1, 0}, new long[] {1, 1, 2, 1});
  }
}
