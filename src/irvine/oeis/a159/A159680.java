package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159680 The general form of the recurrences are the <code>a(j), b(j)</code> and <code>n(j)</code> solutions of the 2 equations problem: <code>9*n(j)+1=a(j)*a(j)</code> and <code>11*n(j)+1=b(j)*b(j)</code> with positive integer numbers.
 * @author Sean A. Irvine
 */
public class A159680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159680() {
    super(new long[] {1, -399, 399}, new long[] {0, 40, 15960});
  }
}
