package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215898 a(4n) = 1+4n, a(1+4n) = -2-6n, a(2+4n) = 4+6n, a(3+4n) = -3-4n.
 * @author Sean A. Irvine
 */
public class A215898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215898() {
    super(new long[] {1, 1, 1, 1, -1, -1, -1}, new long[] {1, -2, 4, -3, 5, -8, 10});
  }
}
