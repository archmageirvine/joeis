package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082114 Diagonal sums of number array A082110.
 * @author Sean A. Irvine
 */
public class A082114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082114() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 9, 32, 89, 210});
  }
}
