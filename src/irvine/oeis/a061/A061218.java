package irvine.oeis.a061;

import irvine.oeis.NestedSequence;
import irvine.oeis.a005.A005179;
import irvine.oeis.a014.A014613;

/**
 * A061218 Least number whose number of divisors is n-th term from A014613 (numbers of form p*q*r*s, products of exactly 4 primes, counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A061218 extends NestedSequence {

  /** Construct the sequence. */
  public A061218() {
    super(1, new A005179(), new A014613(), 1, 1);
  }
}
