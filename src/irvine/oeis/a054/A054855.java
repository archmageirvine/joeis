package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054855 Number of ways to tile a <code>5 X n</code> area with <code>1 X 1</code> and <code>2 X 2</code> tiles.
 * @author Sean A. Irvine
 */
public class A054855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054855() {
    super(new long[] {-3, -2, 7, 2}, new long[] {1, 1, 8, 21});
  }
}
