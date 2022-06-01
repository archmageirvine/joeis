package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154949 Diagonal sums of Riordan array A154948.
 * @author Sean A. Irvine
 */
public class A154949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154949() {
    super(new long[] {-1, -1, 0, 2, 1}, new long[] {1, 1, 3, 5, 10});
  }
}
