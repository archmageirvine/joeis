package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159680 The general form of the recurrences are the a(j), b(j) and n(j) solutions of the 2 equations problem: 9*n(j) + 1 = a(j)*a(j) and 11*n(j) + 1 = b(j)*b(j) with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159680() {
    super(new long[] {1, -399, 399}, new long[] {0, 40, 15960});
  }
}
