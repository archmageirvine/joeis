package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154708 Numbers a such that b and c exist with b &lt;= a &lt; c and a*(a+1) + b^2 = c^2.
 * @author Sean A. Irvine
 */
public class A154708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154708() {
    super(new long[] {-1, 1, 1}, new long[] {3, 4, 7});
  }
}
