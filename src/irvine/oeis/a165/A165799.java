package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165799 Number of tilings of a <code>4 X n</code> rectangle using right trominoes and <code>2 X 2</code> tiles.
 * @author Sean A. Irvine
 */
public class A165799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165799() {
    super(new long[] {-4, 0, -16, -22, -3, 1, 9, 1, 1}, new long[] {1, 0, 1, 4, 6, 16, 37, 92, 245});
  }
}
