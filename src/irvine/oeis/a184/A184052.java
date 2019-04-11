package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184052 The number of order-decreasing partial isometries (of <code>an</code> n-chain).
 * @author Sean A. Irvine
 */
public class A184052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184052() {
    super(new long[] {4, -14, 16, -3, -7, 5}, new long[] {1, 2, 5, 13, 30, 66});
  }
}
