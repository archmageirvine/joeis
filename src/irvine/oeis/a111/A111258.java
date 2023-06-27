package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111258 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+601)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A111258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111258() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 539, 560, 1803, 4740, 4859, 12020});
  }
}
