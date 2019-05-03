package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054854 Number of ways to tile a <code>4 X n</code> region with <code>1 X 1</code> and <code>2 X 2</code> tiles.
 * @author Sean A. Irvine
 */
public class A054854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054854() {
    super(new long[] {-2, 3, 2}, new long[] {1, 1, 5});
  }
}
