package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114208 Number of permutations of [n] having exactly one fixed point and avoiding the patterns 123 and 231.
 * @author Sean A. Irvine
 */
public class A114208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114208() {
    super(1, new long[] {1, 1, -2, -3, 0, 3, 2, -1}, new long[] {1, 0, 3, 2, 6, 6, 12, 10});
  }
}
