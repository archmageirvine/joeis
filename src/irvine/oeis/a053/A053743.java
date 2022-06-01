package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053743 Sum of numbers in range 10*n to 10*n+9.
 * @author Sean A. Irvine
 */
public class A053743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053743() {
    super(new long[] {-1, 2}, new long[] {45, 145});
  }
}
