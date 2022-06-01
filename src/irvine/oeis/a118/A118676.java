package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118676 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+79)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A118676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118676() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 20, 161, 237, 341, 1140, 1580});
  }
}
