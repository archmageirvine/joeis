package irvine.oeis.a257;

import irvine.oeis.FiniteSequence;

/**
 * A257115 Smallest k such that none of k + 1, k + 3,... k + 2n - 1 are squarefree and all of k + 2, k + 4,... k + 2n are squarefree.
 * @author Georg Fischer
 */
public class A257115 extends FiniteSequence {

  /** Construct the sequence. */
  public A257115() {
    super(1, 3, 15, 15, 49, 483, 5049, 6347, 144945);
  }
}
