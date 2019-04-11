package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159678 The general form of the recurrences are the <code>a(j), b(j)</code> and <code>n(j)</code> solutions of the 2-equation problem <code>7*n(j) + 1 = a(j)*a(j)</code> and <code>9*n(j) + 1 = b(j)*b(j)</code> with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159678() {
    super(new long[] {-1, 16}, new long[] {1, 17});
  }
}
