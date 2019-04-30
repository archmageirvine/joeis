package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060819 <code>a(n) = n / gcd(n,4)</code>.
 * @author Sean A. Irvine
 */
public class A060819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060819() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 3, 1, 5, 3, 7, 2});
  }
}
