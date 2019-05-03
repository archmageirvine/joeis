package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226322 Number of tilings of a <code>4 X n</code> rectangle using L tetrominoes and <code>2 X 2</code> tiles.
 * @author Sean A. Irvine
 */
public class A226322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226322() {
    super(new long[] {-2, 0, -4, -2, -3, 0, -1, 0, 4, 6, 5, 0}, new long[] {1, 0, 3, 6, 19, 48, 141, 378, 1063, 2920, 8115, 22418});
  }
}
