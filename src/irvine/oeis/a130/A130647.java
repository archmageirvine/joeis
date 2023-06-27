package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130647 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+839)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130647() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 60, 2241, 2517, 2821, 15180, 16780});
  }
}
