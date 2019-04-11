package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135399 <code>a(n) = (-1)^n + (-2)^n + 3^n (-1, -2</code> and 3 are the roots of the equation <code>x^3 = 7*x + 6)</code>.
 * @author Sean A. Irvine
 */
public class A135399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135399() {
    super(new long[] {6, 7, 0}, new long[] {3, 0, 14});
  }
}
