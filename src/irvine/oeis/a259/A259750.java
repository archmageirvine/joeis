package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259750 Numbers that are congruent to {14, 22} mod 24.
 * @author Sean A. Irvine
 */
public class A259750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259750() {
    super(new long[] {-1, 1, 1}, new long[] {14, 22, 38});
  }
}
