package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226726 Numbers n such that the product of its decimal digits (A007954) is between n/2-1 and n/2+1.
 * @author Georg Fischer
 */
public class A226726 extends FiniteSequence {

  /** Construct the sequence. */
  public A226726() {
    super(1, 19, 27, 36, 289, 379);
  }
}
