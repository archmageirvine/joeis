package irvine.oeis.a085;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085995 Decimal expansion of the prime zeta modulo function at 6 for primes of the form 4k+3.
 * @author Sean A. Irvine
 */
public class A085995 extends DecimalExpansionSequence {

  // This works but is very slow

  /** Construct the sequence. */
  public A085995() {
    super(0, A085991.primeZeta43(6), 10, 10);
  }
}
