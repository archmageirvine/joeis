package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151983 Numbers congruent to {0, 1} mod 32.
 * @author Sean A. Irvine
 */
public class A151983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151983() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 32});
  }
}
