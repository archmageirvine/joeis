package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063652 Number of ways to tile <code>an 8</code> X n rectangle with 1 X 1 and 2 X 2 tiles.
 * @author Sean A. Irvine
 */
public class A063652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063652() {
    super(new long[] {-120, 392, 870, -2810, -1762, 6175, 704, -5430, 845, 1800, -514, -171, 50, 6}, new long[] {1, 1, 34, 171, 2115, 16334, 159651, 1382259, 12727570, 113555791, 1029574631, 9258357134L, 83605623809L, 753361554685L});
  }
}
