package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130645 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+439)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130645() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 44, 1121, 1317, 1541, 7644, 8780});
  }
}
