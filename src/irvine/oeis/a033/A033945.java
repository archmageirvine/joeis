package irvine.oeis.a033;

import irvine.oeis.RecordSequence;

/**
 * A033945 Record highs in A033885 (3n - sum of divisors of n).
 * @author Sean A. Irvine
 */
public class A033945 extends RecordSequence {

  /** Construct the sequence. */
  public A033945() {
    super(new A033885());
  }
}
