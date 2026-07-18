package irvine.oeis.a085;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085998 Decimal expansion of the prime zeta modulo function at 9 for primes of the form 4k+3.
 * @author Sean A. Irvine
 */
public class A085998 extends DecimalExpansionSequence {

  // This works but is very slow

  /** Construct the sequence. */
  public A085998() {
    super(0, A085991.primeZeta43(9), 10, 10);
  }
}
