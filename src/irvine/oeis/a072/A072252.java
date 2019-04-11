package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072252 Numbers n for which one step of the Collatz iteration (3n+1)/2^r gives rise to values <code>41,35,29,23,17,11,</code> and 5 for r=1,3,5,..,13.
 * @author Georg Fischer
 */
public class A072252 extends FiniteSequence {

  /** Construct the sequence. */
  public A072252() {
    super(27, 93, 309, 981, 2901, 7509, 13653);
  }
}
