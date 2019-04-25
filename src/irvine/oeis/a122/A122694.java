package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122694 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+761)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A122694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122694() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 583, 820, 2283, 5440, 6783, 15220});
  }
}
