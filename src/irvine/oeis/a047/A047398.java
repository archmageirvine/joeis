package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047398 Numbers that are congruent to {3, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047398() {
    super(new long[] {-1, 1, 1}, new long[] {3, 6, 11});
  }
}
