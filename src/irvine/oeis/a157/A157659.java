package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157659 <code>a(n) = 100*n^2 - n</code>.
 * @author Sean A. Irvine
 */
public class A157659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157659() {
    super(new long[] {1, -3, 3}, new long[] {99, 398, 897});
  }
}
