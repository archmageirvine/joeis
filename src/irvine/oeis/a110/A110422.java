package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110422 <code>a(n) = sum( (-1)^(r+1)*(n-r)*r, r = 1..floor(n/2) )</code>.
 * @author Sean A. Irvine
 */
public class A110422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110422() {
    super(new long[] {-1, 2, -4, 6, -6, 6, -4, 2}, new long[] {1, 2, -1, -2, 6, 8, -6, -8});
  }
}
