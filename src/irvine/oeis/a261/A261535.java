package irvine.oeis.a261;
// manually 2023-09-05/filter at 2023-09-05 22:03

import irvine.oeis.FilterSequence;
import irvine.oeis.a260.A260478;

/**
 * A261535 Primes of the form Phi(8,n!), where Phi is the cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A261535 extends FilterSequence {

  /** Construct the sequence. */
  public A261535() {
    super(1, new A260478(), PROBABLE_PRIME);
    super.next();
  }
}
