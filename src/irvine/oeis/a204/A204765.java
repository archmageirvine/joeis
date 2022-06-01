package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204765 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+239)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A204765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204765() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 217, 220, 717, 1900, 1917, 4780});
  }
}
