package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110349 a(n) = n + (n+1) + (n-1) + (n+2) + (n-2) ... n terms.
 * @author Sean A. Irvine
 */
public class A110349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110349() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 5, 9, 18, 25});
  }
}
