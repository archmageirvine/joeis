package irvine.oeis.a292;
// manually 2023-09-05/filter at 2023-09-05 16:05

import irvine.oeis.FilterSequence;
import irvine.oeis.a019.A019321;

/**
 * A292007 Primes of the form Phi(k, 3), where Phi is the cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A292007 extends FilterSequence {

  /** Construct the sequence. */
  public A292007() {
    super(1, new A019321(), PROBABLE_PRIME);
    super.next();
  }
}
