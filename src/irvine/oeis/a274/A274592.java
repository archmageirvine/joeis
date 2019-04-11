package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274592 Sum of n-th powers of the roots of <code>x^3 -31* x^2 - 25*x - 1</code>.
 * @author Sean A. Irvine
 */
public class A274592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274592() {
    super(new long[] {1, 25, 31}, new long[] {3, 31, 1011});
  }
}
