package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047341 Numbers that are congruent to {3, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047341() {
    super(new long[] {-1, 1, 1}, new long[] {3, 4, 10});
  }
}
