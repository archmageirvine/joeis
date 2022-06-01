package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187035 Diagonal sums of number triangle A187034.
 * @author Sean A. Irvine
 */
public class A187035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187035() {
    super(new long[] {1, 0, -1, 1, 0}, new long[] {1, 0, 1, -1, 1});
  }
}
