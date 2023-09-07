package irvine.oeis.a292;
// manually 2023-09-05/filter at 2023-09-05 16:05

import irvine.oeis.FilterSequence;
import irvine.oeis.a019.A019325;

/**
 * A292011 Primes of the form Phi(k, 7), where Phi is the cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A292011 extends FilterSequence {

  /** Construct the sequence. */
  public A292011() {
    super(1, new A019325(), PROBABLE_PRIME);
    super.next();
  }
}
