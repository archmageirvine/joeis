package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244871 Number of magic labelings with magic sum n of 3rd graph shown in link.
 * @author Sean A. Irvine
 */
public class A244871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244871() {
    super(new long[] {1, -5, 8, 0, -14, 14, 0, -8, 5}, new long[] {1, 10, 55, 217, 672, 1755, 4030, 8386, 16135});
  }
}
