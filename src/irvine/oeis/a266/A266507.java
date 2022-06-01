package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266507 a(n) = 6*a(n - 1) - a(n - 2) with a(0) = 2, a(1) = 8.
 * @author Sean A. Irvine
 */
public class A266507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266507() {
    super(new long[] {-1, 6}, new long[] {2, 8});
  }
}
