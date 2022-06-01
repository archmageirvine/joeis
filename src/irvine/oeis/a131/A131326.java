package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131326 Row sums of A131325.
 * @author Sean A. Irvine
 */
public class A131326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131326() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 3, 4, 9});
  }
}
