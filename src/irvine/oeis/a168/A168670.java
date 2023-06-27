package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168670 Numbers that are congruent to {1, 8} mod 11.
 * @author Sean A. Irvine
 */
public class A168670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168670() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 8, 12});
  }
}
