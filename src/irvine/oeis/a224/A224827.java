package irvine.oeis.a224;

import irvine.oeis.FiniteSequence;

/**
 * A224827 Primes p such that <code>prime(floor(p/10) + (p mod 10)) =</code> p.
 * @author Georg Fischer
 */
public class A224827 extends FiniteSequence {

  /** Construct the sequence. */
  public A224827() {
    super(64279, 64319, 64483, 64513, 64621);
  }
}
