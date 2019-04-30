package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084068 <code>a(1) = 1, a(2) = 2; a(2*k) = 2*a(2*k-1) - a(2*k-2), a(2*k+1) = 4*a(2*k) - a(2*k-1)</code>.
 * @author Sean A. Irvine
 */
public class A084068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084068() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 2, 7, 12});
  }
}
