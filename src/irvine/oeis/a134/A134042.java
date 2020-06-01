package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134042 Complete list of solutions to <code>y^2 = x^3 + 113;</code> sequence gives x values.
 * @author Georg Fischer
 */
public class A134042 extends FiniteSequence {

  /** Construct the sequence. */
  public A134042() {
    super(-4, 2, 8, 11, 26, 422);
  }
}
