package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134103 Complete list of solutions to y^2 <code>= x^3 + 225</code>; sequence gives x values.
 * @author Georg Fischer
 */
public class A134103 extends FiniteSequence {

  /** Construct the sequence. */
  public A134103() {
    super(-6, -5, 0, 4, 6, 10, 15, 30, 60, 180, 336, 351, 720114);
  }
}
