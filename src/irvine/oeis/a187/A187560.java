package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187560 a(n) = 4^(n+1)-2^n-1.
 * @author Sean A. Irvine
 */
public class A187560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187560() {
    super(new long[] {8, -14, 7}, new long[] {2, 13, 59});
  }
}
