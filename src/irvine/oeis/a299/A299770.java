package irvine.oeis.a299;

import irvine.oeis.FiniteSequence;

/**
 * A299770 a(n) is the total number of elements after n-th stage of a hybrid (and finite) cellular automaton on the infinite square grid, formed by toothpicks of length 2, D-toothpicks, toothpicks of length 1, and T-toothpicks.
 * @author Georg Fischer
 */
public class A299770 extends FiniteSequence {

  /** Construct the sequence. */
  public A299770() {
    super(1, 5, 13, 21, 33, 49, 65, 73, 97, 105);
  }
}
