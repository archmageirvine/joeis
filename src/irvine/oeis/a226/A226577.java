package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226577 Smallest number of integer-sided squares needed to tile a 4 X n rectangle.
 * @author Sean A. Irvine
 */
public class A226577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226577() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 2, 4, 1});
  }
}
