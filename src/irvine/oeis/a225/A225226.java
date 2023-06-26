package irvine.oeis.a225;

import irvine.oeis.FiniteSequence;

/**
 * A225226 Odd primes p or q with the properties that max(p,q) is Wieferich prime 1093 or 3511 and that binomial(p*q-1,(p*q-1)/2) == binomial(p-1,(p-1)/2)*binomial(q-1,(q-1)/2) (mod (p*q)^2).
 * @author Georg Fischer
 */
public class A225226 extends FiniteSequence {

  /** Construct the sequence. */
  public A225226() {
    super(1, FINITE, 3, 5, 7, 13, 1093, 3511);
  }
}
