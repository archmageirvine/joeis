package irvine.oeis.a082;

import irvine.oeis.FilterPositionSequence;

/**
 * A082657 Integers expressible as the sum of a square and a triangular number in just one way.
 * @author Sean A. Irvine
 */
public class A082657 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A082657() {
    super(1, new A082660(), ONE);
  }
}
