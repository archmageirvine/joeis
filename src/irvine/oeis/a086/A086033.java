package irvine.oeis.a086;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086033 Decimal expansion of the prime zeta modulo function at 3 for primes of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A086033 extends DecimalExpansionSequence {

  // This works but is very slow

  /** Construct the sequence. */
  public A086033() {
    super(0, A086032.primeZeta41(3), 10, 10);
  }
}
