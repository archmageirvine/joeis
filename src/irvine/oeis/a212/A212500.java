package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212500 a(n) is the difference between multiples of 5 with even and odd digit sum in base 4 in interval [0,4^n).
 * @author Sean A. Irvine
 */
public class A212500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212500() {
    super(new long[] {-5, 0, 10, 0}, new long[] {1, 4, 7, 36});
  }
}
