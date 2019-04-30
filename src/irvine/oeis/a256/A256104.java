package irvine.oeis.a256;

import irvine.oeis.FiniteSequence;

/**
 * A256104 Differential autobiographical numbers: number <code>n = x0 x1 x2 ... x9</code> such that <code>xi</code> is the number of pairs <code>(xj, xk), j</code> different from k, where <code>|xj - xk| = i</code>.
 * @author Georg Fischer
 */
public class A256104 extends FiniteSequence {

  /** Construct the sequence. */
  public A256104() {
    super(20404, 31330);
  }
}
