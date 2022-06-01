package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134163 1 + 12*n + 81*n^3 + n*(105*n + 81*n^3)/2.
 * @author Sean A. Irvine
 */
public class A134163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134163() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 187, 1531, 5977, 16441});
  }
}
