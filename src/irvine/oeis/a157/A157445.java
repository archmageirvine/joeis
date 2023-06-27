package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157445 a(n) = 14641*n^2 - 4598*n + 362.
 * @author Sean A. Irvine
 */
public class A157445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157445() {
    super(1, new long[] {1, -3, 3}, new long[] {10405, 49730, 118337});
  }
}
