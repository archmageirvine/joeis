package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294963 a(n) is the number of elements added at n-th stage in the structure of the finite cellular automaton of A294962.
 * @author Georg Fischer
 */
public class A294963 extends FiniteSequence {

  /** Construct the sequence. */
  public A294963() {
    super(1, 4, 8, 8, 12, 20, 16, 8, 24, 16);
  }
}
