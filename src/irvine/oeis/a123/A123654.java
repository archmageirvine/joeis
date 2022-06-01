package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123654 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+809)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A123654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123654() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 264, 1491, 2427, 3811, 10764, 16180});
  }
}
