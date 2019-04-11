package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258717 If n even then <code>2*n^2-4*n</code> else <code>2*n^2-4*n-3</code>.
 * @author Sean A. Irvine
 */
public class A258717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258717() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 16, 27});
  }
}
