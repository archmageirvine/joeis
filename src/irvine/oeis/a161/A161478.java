package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161478 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+113)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A161478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161478() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 52, 175, 339, 615, 1312, 2260});
  }
}
