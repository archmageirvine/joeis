package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159661 The general form of the recurrences are the a(j), b(j) and n(j) solutions of the 2 equations problem: 11*n(j) + 1 = a(j)*a(j) and 13*n(j) + 1 = b(j)*b(j) with positive integer elements. the solutions of the 2 equations problem: 11*n(j) + 1 = a(j)*a(j); 13*n(j) + 1 = b(j)*b(j); with integer numbers.
 * @author Sean A. Irvine
 */
public class A159661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159661() {
    super(1, new long[] {-1, 24}, new long[] {1, 25});
  }
}
