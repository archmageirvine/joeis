package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047352 Numbers that are congruent to <code>{0, 2} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047352() {
    super(new long[] {-1, 1, 1}, new long[] {0, 2, 7});
  }
}
