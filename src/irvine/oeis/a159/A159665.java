package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159665 The general form of the recurrences are the a(j), b(j) and n(j) solutions of the 2 equations problem: 11*n(j) + 1 = a(j)*a(j) and 13*n(j) + 1 = b(j)*b(j); with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159665() {
    super(1, new long[] {1, -575, 575}, new long[] {0, 48, 27600});
  }
}
