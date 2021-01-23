package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110273 Pell(n)^3+Pell(n+1)^3.
 * @author Sean A. Irvine
 */
public class A110273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110273() {
    super(new long[] {-1, -12, 30, 12}, new long[] {1, 9, 133, 1853});
  }
}
