package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258717 If n even then 2*n^2-4*n else 2*n^2-4*n-3.
 * @author Sean A. Irvine
 */
public class A258717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258717() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 16, 27});
  }
}
