package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134166 Complete list of solutions to <code>y^2 = x^3 + 1025</code>; sequence gives y values.
 * @author Georg Fischer
 */
public class A134166 extends FiniteSequence {

  /** Construct the sequence. */
  public A134166() {
    super(5, 30, 31, 32, 33, 45, 95, 255, 355, 513, 1930, 2139, 9419, 27905, 218796, 227805);
  }
}
