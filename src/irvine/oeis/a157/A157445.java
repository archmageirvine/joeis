package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157445 <code>a(n) = 14641*n^2 - 4598*n + 362</code>.
 * @author Sean A. Irvine
 */
public class A157445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157445() {
    super(new long[] {1, -3, 3}, new long[] {10405, 49730, 118337});
  }
}
