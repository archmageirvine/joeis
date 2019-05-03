package irvine.oeis.a087;

import irvine.oeis.FiniteSequence;

/**
 * A087573 Smallest number k such that <code>prime(4) +</code> k, <code>prime(5) +</code> k, ..., <code>prime(n+3) +</code> k are all prime.
 * @author Georg Fischer
 */
public class A087573 extends FiniteSequence {

  /** Construct the sequence. */
  public A087573() {
    super(4, 6, 6, 6, 90, 90);
  }
}
