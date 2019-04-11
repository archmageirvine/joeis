package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173309 <code>19*n*(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A173309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173309() {
    super(new long[] {1, -3, 3}, new long[] {0, 38, 114});
  }
}
