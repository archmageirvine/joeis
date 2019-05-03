package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020994 Primes that are both left-truncatable and <code>right-truncatable</code>.
 * @author Georg Fischer
 */
public class A020994 extends FiniteSequence {

  /** Construct the sequence. */
  public A020994() {
    super(2, 3, 5, 7, 23, 37, 53, 73, 313, 317, 373, 797, 3137, 3797, 739397);
  }
}
