package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129682 Number of ways tiling a <code>2 X n</code> rectangle with <code>2 X 1 (domino)</code> and <code>3 X 1 (tromino)</code> tiles.
 * @author Sean A. Irvine
 */
public class A129682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129682() {
    super(new long[] {-1, 1, -2, 1, 0, 2}, new long[] {1, 1, 2, 4, 7, 15});
  }
}
