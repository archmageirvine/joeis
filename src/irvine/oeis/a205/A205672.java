package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205672 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+329)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A205672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205672() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 87, 112, 184, 235, 376, 451, 595, 660, 987, 1440, 1575, 1971, 2256, 3055, 3484, 4312, 4687, 6580});
  }
}
