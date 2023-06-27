package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130004 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+449)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130004() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 31, 1204, 1347, 1504, 8151, 8980});
  }
}
