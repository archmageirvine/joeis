package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058962 a(n) = 2^(2*n)*(2*n+1).
 * @author Sean A. Irvine
 */
public class A058962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058962() {
    super(new long[] {-16, 8}, new long[] {1, 12});
  }
}
