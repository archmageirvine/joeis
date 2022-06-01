package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274501 a(n) = 25*binomial(n-1,6) + binomial(n-1,5).
 * @author Sean A. Irvine
 */
public class A274501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274501() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 31, 196, 756, 2226, 5502});
  }
}
