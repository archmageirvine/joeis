package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128795 <code>n^3*9^n</code>.
 * @author Sean A. Irvine
 */
public class A128795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128795() {
    super(new long[] {-6561, 2916, -486, 36}, new long[] {0, 9, 648, 19683});
  }
}
