package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212592 a(n) is the difference between multiples of 7 with even and odd digit sum in base 6 in interval [0,6^n).
 * @author Sean A. Irvine
 */
public class A212592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212592() {
    super(new long[] {7, 0, -35, 0, 21, 0}, new long[] {1, 6, 11, 106, 201, 2022});
  }
}
