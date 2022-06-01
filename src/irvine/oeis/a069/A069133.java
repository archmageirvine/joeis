package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069133 Centered 20-gonal (or icosagonal) numbers.
 * @author Sean A. Irvine
 */
public class A069133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069133() {
    super(new long[] {1, -3, 3}, new long[] {1, 21, 61});
  }
}
