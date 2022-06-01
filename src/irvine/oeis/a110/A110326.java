package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110326 Diagonal sums of triangle A110324.
 * @author Sean A. Irvine
 */
public class A110326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110326() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, -1, -3, -2, -11, -3});
  }
}
