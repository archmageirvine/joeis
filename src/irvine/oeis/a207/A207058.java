package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207058 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2 + (x+263)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A207058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207058() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 145, 364, 789, 1564, 2805, 5260});
  }
}
