package irvine.oeis.a086;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086035 Decimal expansion of the prime zeta modulo function at 5 for primes of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A086035 extends DecimalExpansionSequence {

  // This works but is very slow

  /** Construct the sequence. */
  public A086035() {
    super(0, A086032.primeZeta41(5), 10, 10);
  }
}
