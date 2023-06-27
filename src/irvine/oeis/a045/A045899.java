package irvine.oeis.a045;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A045899 Numbers k such that k+1 and 3*k+1 are perfect squares.
 * @author Sean A. Irvine
 */
public class A045899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045899() {
    super(1, new long[] {1, -15, 15}, new long[] {0, 8, 120});
  }
}
