package irvine.oeis.a256;

import irvine.oeis.FiniteSequence;

/**
 * A256104 Differential autobiographical numbers: number <code>n = x0 x1 x2 ... x9</code> such that xi is the number of pairs <code>(xj, xk)</code>, j different from k, where <code>|xj - xk| =</code> i.
 * @author Georg Fischer
 */
public class A256104 extends FiniteSequence {

  /** Construct the sequence. */
  public A256104() {
    super(20404, 31330);
  }
}
