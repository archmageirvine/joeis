package irvine.oeis.a245;

import irvine.oeis.FiniteSequence;

/**
 * A245779 Numbers n such that (n/tau(n) - sigma(n)/n) &lt; 1.
 * @author Georg Fischer
 */
public class A245779 extends FiniteSequence {

  /** Construct the sequence. */
  public A245779() {
    super(1, 2, 3, 4, 6, 8, 10, 12, 18, 24);
  }
}
