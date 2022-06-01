package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078366 A Chebyshev S-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078366() {
    super(new long[] {-1, 17}, new long[] {1, 17});
  }
}
