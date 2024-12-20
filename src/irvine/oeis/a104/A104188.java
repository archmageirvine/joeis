package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104188 a(n) = 4*n*(4*n - 1).
 * @author Sean A. Irvine
 */
public class A104188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104188() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 56});
  }
}
