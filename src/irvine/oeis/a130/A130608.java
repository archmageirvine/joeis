package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130608 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+167)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130608() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 28, 385, 501, 645, 2668, 3340});
  }
}
