package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226960 Numbers n such that 1^n + 2^n + 3^n +...+ n^n == 2 (mod n).
 * @author Georg Fischer
 */
public class A226960 extends FiniteSequence {

  /** Construct the sequence. */
  public A226960() {
    super(1, 4, 12, 84, 3612);
  }
}
