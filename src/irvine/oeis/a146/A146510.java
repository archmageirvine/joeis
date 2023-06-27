package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146510 Numbers congruent to {1, 4} mod 15.
 * @author Sean A. Irvine
 */
public class A146510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146510() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 4, 16});
  }
}
