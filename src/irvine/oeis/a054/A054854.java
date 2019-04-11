package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054854 Number of ways to tile <code>a 4</code> X n region with 1 X 1 and 2 X 2 tiles.
 * @author Sean A. Irvine
 */
public class A054854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054854() {
    super(new long[] {-2, 3, 2}, new long[] {1, 1, 5});
  }
}
