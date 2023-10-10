package irvine.oeis.a066;

import irvine.oeis.NoncomputableSequence;

/**
 * A066352 Pillai sequence: a(n) is the smallest term in A007924 requiring n primes.
 * @author Sean A. Irvine
 */
public class A066352 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A066352() {
    super(0, NONCOMPUTABLE, 0, 1, 4, 27, 1354, 401429925999155061L);
  }
}
