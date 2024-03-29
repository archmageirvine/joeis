package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166959 Numbers congruent to (12,32) mod 44.
 * @author Sean A. Irvine
 */
public class A166959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166959() {
    super(1, new long[] {-1, 1, 1}, new long[] {12, 32, 56});
  }
}
