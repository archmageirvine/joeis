package irvine.oeis.a225;

import irvine.oeis.FiniteSequence;

/**
 * A225226 Odd primes p or q with the properties that <code>max(p,q)</code> is Wieferich prime 1093 or 3511 and that <code>binomial(p*q-1,(p*q-1)/2) == binomial(p-1,(p-1)/2)*binomial(q-1,(q-1)/2) (mod (p*q)^2)</code>.
 * @author Georg Fischer
 */
public class A225226 extends FiniteSequence {

  /** Construct the sequence. */
  public A225226() {
    super(3, 5, 7, 13, 1093, 3511);
  }
}
