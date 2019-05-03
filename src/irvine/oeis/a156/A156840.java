package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156840 Numbers k <code>&gt;= 1</code> such that <code>k^2 == 1 (mod 900)</code>.
 * @author Sean A. Irvine
 */
public class A156840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156840() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 199, 251, 449, 451});
  }
}
