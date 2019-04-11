package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067726 <code>a(n) = 6*n^2 + 12*n</code>.
 * @author Sean A. Irvine
 */
public class A067726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067726() {
    super(new long[] {1, -3, 3}, new long[] {18, 48, 90});
  }
}
