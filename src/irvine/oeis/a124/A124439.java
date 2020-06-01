package irvine.oeis.a124;

import irvine.oeis.FiniteSequence;

/**
 * A124439 Complete list of solutions to <code>y^2 = x^3 + 17;</code> sequence gives x values.
 * @author Georg Fischer
 */
public class A124439 extends FiniteSequence {

  /** Construct the sequence. */
  public A124439() {
    super(-1, -2, 2, 4, 8, 43, 52, 5234);
  }
}
