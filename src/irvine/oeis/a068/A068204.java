package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068204 Let (x_n, y_n) be n-th solution to the Pell equation <code>x^2 = 14*y^2 + 1</code>. Sequence gives {y_n}.
 * @author Sean A. Irvine
 */
public class A068204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068204() {
    super(new long[] {-1, 30}, new long[] {0, 4});
  }
}
