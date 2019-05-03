package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083364 Antidiagonal sums of table <code>A083362</code>.
 * @author Sean A. Irvine
 */
public class A083364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083364() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 17, 32, 71, 105, 187});
  }
}
