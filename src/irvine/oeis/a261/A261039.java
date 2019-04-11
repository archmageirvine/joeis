package irvine.oeis.a261;

import irvine.oeis.FiniteSequence;

/**
 * A261039 Numbers n that begin a sequence of 100 consecutive integers <code>(n, n+1, </code>..., <code>n+99)</code> containing at least 25 primes.
 * @author Georg Fischer
 */
public class A261039 extends FiniteSequence {

  /** Construct the sequence. */
  public A261039() {
    super(1, 2, 3, 4, 5, 10, 11);
  }
}
