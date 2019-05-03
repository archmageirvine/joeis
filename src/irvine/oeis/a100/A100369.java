package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100369 Largest primes arising in <code>A099756</code> which were built up from n distinct digits. This sequence differs from <code>A007810</code> because more than one copy of each digit is permitted.
 * @author Georg Fischer
 */
public class A100369 extends FiniteSequence {

  /** Construct the sequence. */
  public A100369() {
    super(11, 787, 22259, 70879, 607889, 4456789, 40456789, 304456879L, 1123465789L, 10123457689L);
  }
}
