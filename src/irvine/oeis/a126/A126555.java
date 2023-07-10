package irvine.oeis.a126;

import irvine.oeis.FilterSequence;

/**
 * A126555 Primes in A126554.
 * @author Sean A. Irvine
 */
public class A126555 extends FilterSequence {

  /** Construct the sequence. */
  public A126555() {
    super(new A126554(), PRIME);
  }
}
