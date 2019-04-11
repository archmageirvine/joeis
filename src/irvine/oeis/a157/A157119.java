package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157119 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2+(x+103)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A157119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157119() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 84, 105, 309, 765, 884, 2060});
  }
}
