package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212706 a(n) is the difference between numbers of nonnegative multiples of 2*n+1 with even and odd digit sum in base 2*n in interval [0, (2*n)^9).
 * @author Sean A. Irvine
 */
public class A212706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212706() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {81, 5825, 73745, 461313, 1951057, 6418369, 17712657, 42921473});
  }
}
