package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264750 Number of sequences of 5 throws of <code>an</code> n-sided die (with faces numbered <code>1, 2, </code>..., <code>n)</code> in which the sum of the throws first reaches or exceeds n on the 5th throw.
 * @author Sean A. Irvine
 */
public class A264750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264750() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {5, 29, 99, 259, 574, 1134});
  }
}
