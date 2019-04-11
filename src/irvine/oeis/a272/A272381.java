package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272381 Primes p <code>== 1 (mod 3)</code> for which A261029(10*p) <code>= 2</code>.
 * @author Georg Fischer
 */
public class A272381 extends FiniteSequence {

  /** Construct the sequence. */
  public A272381() {
    super(7, 13, 19, 31, 37, 73);
  }
}
