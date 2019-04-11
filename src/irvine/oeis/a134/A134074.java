package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134074 Complete list of solutions to y^2 <code>= x^3 + 73</code>; sequence gives x values.
 * @author Georg Fischer
 */
public class A134074 extends FiniteSequence {

  /** Construct the sequence. */
  public A134074() {
    super(-4, 2, 3, 6, 72, 356);
  }
}
