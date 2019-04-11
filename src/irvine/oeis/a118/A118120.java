package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118120 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+17)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A118120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118120() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 7, 28, 51, 88, 207, 340});
  }
}
