package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173873 a(n) = 2*a(n-1) + 13, a(1)=1.
 * @author Sean A. Irvine
 */
public class A173873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173873() {
    super(new long[] {-2, 3}, new long[] {1, 15});
  }
}
