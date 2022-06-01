package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112524 a(n) = a(n-1) + 2*n^2 with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A112524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112524() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 9, 27, 59});
  }
}
