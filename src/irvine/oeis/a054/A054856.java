package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054856 Number of ways to tile <code>a 4</code> X n region with 1 X <code>1, 2</code> X <code>2, 3</code> X 3 and 4 X 4 tiles.
 * @author Sean A. Irvine
 */
public class A054856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054856() {
    super(new long[] {-1, -1, 0, 3, 2}, new long[] {1, 1, 5, 13, 40});
  }
}
