package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226961 Numbers n such that 1^n + 2^n + 3^n + ... + n^n == 3 (mod n).
 * @author Georg Fischer
 */
public class A226961 extends FiniteSequence {

  /** Construct the sequence. */
  public A226961() {
    super(1, 2, 3, 18, 126, 5418);
  }
}
