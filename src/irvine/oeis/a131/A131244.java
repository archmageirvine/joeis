package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131244 Row sums of triangle <code>A131243</code>.
 * @author Sean A. Irvine
 */
public class A131244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131244() {
    super(new long[] {-1, -3, 2, 2}, new long[] {1, 3, 6, 14});
  }
}
