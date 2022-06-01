package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169963 Number of (2n+1)-digit squares in carryless arithmetic mod 10.
 * @author Sean A. Irvine
 */
public class A169963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169963() {
    super(new long[] {-20, 12}, new long[] {5, 46});
  }
}
