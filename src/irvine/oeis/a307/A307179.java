package irvine.oeis.a307;

import irvine.oeis.FiniteSequence;

/**
 * A307179 Numbers k such that k <code>= i*j = 6*i +</code> j, where i and j are integers.
 * @author Georg Fischer
 */
public class A307179 extends FiniteSequence {

  /** Construct the sequence. */
  public A307179() {
    super(-25, -8, -3, 0, 24, 27, 32, 49);
  }
}
