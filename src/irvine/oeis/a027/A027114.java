package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027114 a(n) = A027113(n, n+2).
 * @author Sean A. Irvine
 */
public class A027114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027114() {
    super(2, new long[] {-1, 0, 0, 2}, new long[] {3, 9, 20, 40});
  }
}
