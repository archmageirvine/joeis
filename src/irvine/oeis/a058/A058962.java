package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058962 <code>a(n) = 2^(2*n)*(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A058962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058962() {
    super(new long[] {-16, 8}, new long[] {1, 12});
  }
}
