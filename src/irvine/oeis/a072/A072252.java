package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072252 Numbers n for which one step of the Collatz iteration <code>(3n+1)/2^r</code> gives rise to values 41,35,29,23,17,11, and 5 for <code>r=1,3,5,..,13</code>.
 * @author Georg Fischer
 */
public class A072252 extends FiniteSequence {

  /** Construct the sequence. */
  public A072252() {
    super(27, 93, 309, 981, 2901, 7509, 13653);
  }
}
