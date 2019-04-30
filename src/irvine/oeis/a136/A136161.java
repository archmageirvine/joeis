package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136161 <code>a(n) = 2*a(n-3)-a(n-6)</code>, starting <code>a(0..5) = 0, 5, 2, 1, 3, 1</code>.
 * @author Sean A. Irvine
 */
public class A136161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136161() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 5, 2, 1, 3, 1});
  }
}
