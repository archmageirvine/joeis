package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070435 <code>a(n) = n^2 mod 12,</code> or alternately <code>n^4 mod 12</code>.
 * @author Sean A. Irvine
 */
public class A070435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070435() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 4, 1});
  }
}
