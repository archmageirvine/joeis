package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097896 Number of compositions of n with either all parts odd or all parts even.
 * @author Sean A. Irvine
 */
public class A097896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097896() {
    super(new long[] {-2, -2, 3, 1}, new long[] {1, 2, 2, 5});
  }
}
