package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130017 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+967)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130017() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 45, 2688, 2901, 3128, 18105, 19340});
  }
}
