package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134107 Complete list of solutions to y^2 <code>= x^3 - 207</code>; sequence gives x values.
 * @author Georg Fischer
 */
public class A134107 extends FiniteSequence {

  /** Construct the sequence. */
  public A134107() {
    super(6, 12, 18, 31, 312, 331, 367806);
  }
}
