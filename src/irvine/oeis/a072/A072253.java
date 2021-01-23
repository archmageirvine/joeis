package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072253 Numbers n for which one step of the Collatz iteration (3n+1)/2^r gives rise to values 59,53,47,41,35,29,23,17,11 and 5 for r=1,3,5,..,19.
 * @author Georg Fischer
 */
public class A072253 extends FiniteSequence {

  /** Construct the sequence. */
  public A072253() {
    super(39, 141, 501, 1749, 5973, 19797, 62805, 185685, 480597, 873813);
  }
}
