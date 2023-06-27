package irvine.oeis.a222;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A222390 Nonnegative integers m such that 10*m*(m+1)+1 is a square.
 * @author Sean A. Irvine
 */
public class A222390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222390() {
    super(1, new long[] {1, -1, -38, 38, 1}, new long[] {0, 3, 15, 132, 588});
  }
}
