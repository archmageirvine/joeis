package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131244 Row sums of triangle A131243.
 * @author Sean A. Irvine
 */
public class A131244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131244() {
    super(new long[] {-1, -3, 2, 2}, new long[] {1, 3, 6, 14});
  }
}
