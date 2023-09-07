package irvine.oeis.a292;
// manually 2023-09-05/filter at 2023-09-05 16:05

import irvine.oeis.FilterSequence;
import irvine.oeis.a019.A019323;

/**
 * A292009 Primes of the form Phi(k, 5), where Phi is the cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A292009 extends FilterSequence {

  /** Construct the sequence. */
  public A292009() {
    super(1, new A019323(), PROBABLE_PRIME);
    super.next();
  }
}
