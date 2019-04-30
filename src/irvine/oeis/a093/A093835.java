package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093835 <code>n*Jacobsthal(n)</code>.
 * @author Sean A. Irvine
 */
public class A093835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093835() {
    super(new long[] {-4, -4, 3, 2}, new long[] {0, 1, 2, 9});
  }
}
