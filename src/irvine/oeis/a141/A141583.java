package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141583 Squares of tribonacci numbers A000213.
 * @author Sean A. Irvine
 */
public class A141583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141583() {
    super(new long[] {-1, 0, -1, 6, 3, 2}, new long[] {1, 1, 1, 9, 25, 81});
  }
}
