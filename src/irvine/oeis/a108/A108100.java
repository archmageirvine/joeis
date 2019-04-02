package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108100 (2*n-1)^2+(2*n+1)^2.
 * @author Sean A. Irvine
 */
public class A108100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108100() {
    super(new long[] {1, -3, 3}, new long[] {2, 10, 34});
  }
}
