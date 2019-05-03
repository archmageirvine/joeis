package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100185 Structured <code>meta-anti-prism</code> numbers, the n-th number from a structured <code>n-gonal anti-prism</code> number sequence.
 * @author Sean A. Irvine
 */
public class A100185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100185() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 19, 68, 185});
  }
}
