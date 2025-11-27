package irvine.oeis.a387;

import irvine.oeis.FiniteSequence;

/**
 * A387487 Numbers in the ring of integers Z such that k * k = k, the idempotents of Z.
 * @author Georg Fischer
 */
public class A387487 extends FiniteSequence {

  /** Construct the sequence. */
  public A387487() {
    super(1, FINITE, "0,1");
  }
}
