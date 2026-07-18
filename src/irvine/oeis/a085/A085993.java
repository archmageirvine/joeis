package irvine.oeis.a085;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085993 Decimal expansion of the prime zeta modulo function at 4 for primes of the form 4k+3.
 * @author Sean A. Irvine
 */
public class A085993 extends DecimalExpansionSequence {

  // This works but is very slow

  /** Construct the sequence. */
  public A085993() {
    super(0, A085991.primeZeta43(4), 10, 10);
  }
}
