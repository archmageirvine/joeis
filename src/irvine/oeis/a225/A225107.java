package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225107 Number of (4n-3)-digit 4th powers in carryless arithmetic mod 10.
 * @author Sean A. Irvine
 */
public class A225107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225107() {
    super(new long[] {-20, 12}, new long[] {3, 24});
  }
}
