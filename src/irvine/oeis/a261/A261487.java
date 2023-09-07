package irvine.oeis.a261;
// manually 2023-09-05/filter at 2023-09-05 22:03

import irvine.oeis.FilterSequence;

/**
 * A261487 Primes of the form Phi(7,n!), where Phi is the cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A261487 extends FilterSequence {

  /** Construct the sequence. */
  public A261487() {
    super(1, new A261128(), PRIME);
    super.next();
  }
}
