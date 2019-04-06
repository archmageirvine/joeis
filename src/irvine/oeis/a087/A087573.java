package irvine.oeis.a087;

import irvine.oeis.FiniteSequence;

/**
 * A087573 Smallest number k such that prime(4) + k, prime(5) + k, ..., prime(n+3) + k are all prime.
 * @author Georg Fischer
 */
public class A087573 extends FiniteSequence {

  /** Construct the sequence. */
  public A087573() {
    super(4, 6, 6, 6, 90, 90);
  }
}
