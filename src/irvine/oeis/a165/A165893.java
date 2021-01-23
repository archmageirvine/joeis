package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165893 Numbers n with property that n(n+2)(n+4) is a triangular number.
 * @author Georg Fischer
 */
public class A165893 extends FiniteSequence {

  /** Construct the sequence. */
  public A165893() {
    super(0, 1, 3, 11, 30, 40, 122, 130, 1972);
  }
}
