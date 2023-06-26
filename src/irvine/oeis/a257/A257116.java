package irvine.oeis.a257;

import irvine.oeis.FiniteSequence;

/**
 * A257116 Smallest prime p such that none of p + 1, p + 3,... p + 2n - 1 are squarefree and all of p + 2, p + 4,... p + 2n are squarefree.
 * @author Georg Fischer
 */
public class A257116 extends FiniteSequence {

  /** Construct the sequence. */
  public A257116() {
    super(1, FINITE, 3, 17, 487, 947, 947, 38639, 38639);
  }
}
