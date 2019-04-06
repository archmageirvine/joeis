package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238008 Numbers n such that n*(n+3)*(n+6) is a triangular number.
 * @author Georg Fischer
 */
public class A238008 extends FiniteSequence {

  /** Construct the sequence. */
  public A238008() {
    super(-5, -3, 0, 1, 10, 12, 22, 159, 639, 651, 2629);
  }
}
