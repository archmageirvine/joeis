package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178521 The cost of all leaves in the Fibonacci tree of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A178521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178521() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 0, 3, 7});
  }
}
