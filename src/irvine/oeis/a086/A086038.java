package irvine.oeis.a086;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086038 Decimal expansion of the prime zeta modulo function at 8 for primes of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A086038 extends DecimalExpansionSequence {

  // This works but is very slow

  /** Construct the sequence. */
  public A086038() {
    super(0, A086032.primeZeta41(8), 10, 10);
  }
}
