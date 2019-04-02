package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047206 Numbers that are congruent to {1, 3, 4} mod 5.
 * @author Sean A. Irvine
 */
public class A047206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047206() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 4, 6});
  }
}
