package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130646 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+727)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130646() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 56, 1925, 2181, 2465, 13056, 14540});
  }
}
