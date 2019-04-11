package irvine.oeis.a109;

import irvine.oeis.FiniteSequence;

/**
 * A109632 In the game of bridge, <code>a(n)</code> is the penalty for going down n tricks in a vulnerable, doubled contract.
 * @author Georg Fischer
 */
public class A109632 extends FiniteSequence {

  /** Construct the sequence. */
  public A109632() {
    super(200, 500, 800, 1100, 1400, 1700, 2000, 2300, 2600, 2900, 3200, 3500, 3800);
  }
}
