package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097571 Numbers n such that triangular number <code>t(n) (see A000217) = n(n+1)/2</code> is a product of three consecutive integers.
 * @author Georg Fischer
 */
public class A097571 extends FiniteSequence {

  /** Construct the sequence. */
  public A097571() {
    super(0, 3, 15, 20, 44, 608, 22736);
  }
}
