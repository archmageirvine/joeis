package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045899 Numbers k such that <code>k+1</code> and <code>3*k+1</code> are perfect squares.
 * @author Sean A. Irvine
 */
public class A045899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045899() {
    super(new long[] {1, -15, 15}, new long[] {0, 8, 120});
  }
}
