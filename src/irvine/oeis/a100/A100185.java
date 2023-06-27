package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100185 Structured meta-anti-prism numbers, the n-th number from a structured n-gonal anti-prism number sequence.
 * @author Sean A. Irvine
 */
public class A100185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100185() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 19, 68, 185});
  }
}
