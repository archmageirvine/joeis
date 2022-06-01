package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101501 Number of walks between adjacent nodes on C_5 tensor J_2.
 * @author Sean A. Irvine
 */
public class A101501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101501() {
    super(new long[] {-16, 12, 2}, new long[] {0, 1, 0});
  }
}
