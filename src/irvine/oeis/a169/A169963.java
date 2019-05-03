package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169963 Number of <code>(2n+1)-digit</code> squares in carryless arithmetic <code>mod 10</code>.
 * @author Sean A. Irvine
 */
public class A169963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169963() {
    super(new long[] {-20, 12}, new long[] {5, 46});
  }
}
