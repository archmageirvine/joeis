package irvine.oeis.a109;

import irvine.oeis.FiniteSequence;

/**
 * A109633 In the game of bridge, <code>a(n)</code> is the penalty for going down n tricks in a <code>non-vulnerable</code>, doubled contract.
 * @author Georg Fischer
 */
public class A109633 extends FiniteSequence {

  /** Construct the sequence. */
  public A109633() {
    super(100, 300, 500, 800, 1100, 1400, 1700, 2000, 2300, 2600, 2900, 3200, 3500);
  }
}
