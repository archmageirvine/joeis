package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185394 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+193)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A185394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185394() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 152, 203, 579, 1403, 1692, 3860});
  }
}
