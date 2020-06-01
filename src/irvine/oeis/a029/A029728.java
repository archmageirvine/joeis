package irvine.oeis.a029;

import irvine.oeis.FiniteSequence;

/**
 * A029728 Complete list of solutions to <code>y^2 = x^3 + 17;</code> sequence gives x values.
 * @author Georg Fischer
 */
public class A029728 extends FiniteSequence {

  /** Construct the sequence. */
  public A029728() {
    super(-2, -1, 2, 4, 8, 43, 52, 5234);
  }
}
