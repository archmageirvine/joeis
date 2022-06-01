package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238411 a(n) = 2*n*floor(n/2).
 * @author Sean A. Irvine
 */
public class A238411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238411() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 4, 6, 16, 20});
  }
}
