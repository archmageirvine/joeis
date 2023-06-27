package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090772 Numbers that are congruent to {2, 8} mod 10.
 * @author Sean A. Irvine
 */
public class A090772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090772() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 8, 12});
  }
}
