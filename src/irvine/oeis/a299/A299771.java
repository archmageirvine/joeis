package irvine.oeis.a299;

import irvine.oeis.FiniteSequence;

/**
 * A299771 <code>a(n)</code> is the number of elements added at n-th stage in the structure of the finite cellular automaton of A299770.
 * @author Georg Fischer
 */
public class A299771 extends FiniteSequence {

  /** Construct the sequence. */
  public A299771() {
    super(1, 4, 8, 8, 12, 16, 16, 8, 24, 8);
  }
}
