package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198294 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+217)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A198294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198294() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 63, 68, 135, 155, 248, 276, 407, 420, 651, 980, 1007, 1376, 1488, 2015, 2175, 2928, 3003, 4340});
  }
}
