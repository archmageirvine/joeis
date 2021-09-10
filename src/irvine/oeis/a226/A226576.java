package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226576 Smallest number of integer-sided squares needed to tile a 3 X n rectangle.
 * @author Sean A. Irvine
 */
public class A226576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226576() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 3, 1});
  }
}
