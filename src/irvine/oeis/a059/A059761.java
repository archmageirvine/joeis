package irvine.oeis.a059;

import irvine.oeis.FilterSequence;

/**
 * A059761 Initial primes of Cunningham chains of first type with length exactly 2. Primes in A059453 which survive as primes only one "2p-1 iteration", forming chains of exactly 2 terms.
 * @author Sean A. Irvine
 */
public class A059761 extends FilterSequence {

  /** Construct the sequence. */
  public A059761() {
    super(new A059453(), k -> !k.multiply(4).add(3).isProbablePrime());
  }
}
