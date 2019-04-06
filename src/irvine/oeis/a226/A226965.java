package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226965 Numbers n such that 1^n + 2^n + 3^n +...+ n^n == 7 (mod n).
 * @author Georg Fischer
 */
public class A226965 extends FiniteSequence {

  /** Construct the sequence. */
  public A226965() {
    super(1, 2, 6, 7, 14, 294, 12642);
  }
}
