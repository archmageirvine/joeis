package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156774 a(n) = 6561*n^2 - 3564*n + 485.
 * @author Sean A. Irvine
 */
public class A156774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156774() {
    super(new long[] {1, -3, 3}, new long[] {485, 3482, 19601});
  }
}
