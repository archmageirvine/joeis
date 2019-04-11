package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047408 Numbers that are congruent to <code>{1, 4, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047408() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 6, 9});
  }
}
