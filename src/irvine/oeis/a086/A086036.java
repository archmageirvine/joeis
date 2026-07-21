package irvine.oeis.a086;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086036 Decimal expansion of the prime zeta modulo function at 6 for primes of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A086036 extends DecimalExpansionSequence {

  // This works but is very slow

  /** Construct the sequence. */
  public A086036() {
    super(0, A086032.primeZeta41(6), 10, 10);
  }
}
