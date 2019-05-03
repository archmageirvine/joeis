package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110326 Diagonal sums of triangle <code>A110324</code>.
 * @author Sean A. Irvine
 */
public class A110326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110326() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, -1, -3, -2, -11, -3});
  }
}
