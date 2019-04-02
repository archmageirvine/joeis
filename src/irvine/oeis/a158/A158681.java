package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158681 Wiener indexes of the complete binary trees with n levels, root being at level 0.
 * @author Sean A. Irvine
 */
public class A158681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158681() {
    super(new long[] {-64, 96, -52, 12}, new long[] {4, 48, 368, 2304});
  }
}
