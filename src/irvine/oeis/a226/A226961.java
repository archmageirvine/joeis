package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226961 Numbers n such that <code>1^n + 2^n + 3^n +</code> ... <code>+ n^n == 3 (mod n)</code>.
 * @author Georg Fischer
 */
public class A226961 extends FiniteSequence {

  /** Construct the sequence. */
  public A226961() {
    super(1, 2, 3, 18, 126, 5418);
  }
}
