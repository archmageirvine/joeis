package irvine.oeis.a060;

import irvine.oeis.FiniteSequence;

/**
 * A060728 Numbers n such that Ramanujan's equation <code>x^2 + 7 = 2^n</code> has an integer solution.
 * @author Georg Fischer
 */
public class A060728 extends FiniteSequence {

  /** Construct the sequence. */
  public A060728() {
    super(3, 4, 5, 7, 15);
  }
}
