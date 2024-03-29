package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158364 529n^2 - 2n.
 * @author Sean A. Irvine
 */
public class A158364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158364() {
    super(1, new long[] {1, -3, 3}, new long[] {527, 2112, 4755});
  }
}
