package irvine.oeis.a069;

import irvine.oeis.UnionSequence;

/**
 * A069686 Primes whose internal digits form a prime.
 * @author Sean A. Irvine
 */
public class A069686 extends UnionSequence {

  /** Construct the sequence. */
  public A069686() {
    super(new A069677(), new A069678(), new A069680(), new A069682());
    skip(25); // skip past all 1 and 2 digit cases
  }
}
