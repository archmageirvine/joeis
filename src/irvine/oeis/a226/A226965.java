package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226965 Numbers n such that <code>1^n + 2^n + 3^n +</code>...+ <code>n^n == 7 (mod n)</code>.
 * @author Georg Fischer
 */
public class A226965 extends FiniteSequence {

  /** Construct the sequence. */
  public A226965() {
    super(1, 2, 6, 7, 14, 294, 12642);
  }
}
