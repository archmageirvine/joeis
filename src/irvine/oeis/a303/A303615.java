package irvine.oeis.a303;

import irvine.oeis.FiniteSequence;

/**
 * A303615 Complete list of solutions to <code>y^2 + y = x^3 - 525x + 10156;</code> sequence gives x values.
 * @author Georg Fischer
 */
public class A303615 extends FiniteSequence {

  /** Construct the sequence. */
  public A303615() {
    super(-29, -25, -20, -14, -5, 5, 14, 16, 20, 25, 49, 70, 79, 130, 250, 305, 400, 695, 1555, 1645, 18895);
  }
}
