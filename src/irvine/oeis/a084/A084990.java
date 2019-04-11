package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084990 <code>a(n) = n*(n^2+3*n-1)/3</code>.
 * @author Sean A. Irvine
 */
public class A084990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084990() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 6, 17});
  }
}
