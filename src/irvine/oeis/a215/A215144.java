package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215144 a(n) = 19*n + 1.
 * @author Sean A. Irvine
 */
public class A215144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215144() {
    super(new long[] {-1, 2}, new long[] {1, 20});
  }
}
