package irvine.oeis.a292;
// manually 2023-09-05/filter at 2023-09-05 16:05

import irvine.oeis.FilterSequence;
import irvine.oeis.a019.A019320;

/**
 * A292015 Primes of the form Phi(k, 2), where Phi is the cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A292015 extends FilterSequence {

  /** Construct the sequence. */
  public A292015() {
    super(1, new A019320(), PROBABLE_PRIME);
    super.next();
  }
}
