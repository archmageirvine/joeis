package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130005 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+577)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130005() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 35, 1568, 1731, 1908, 10595, 11540});
  }
}
