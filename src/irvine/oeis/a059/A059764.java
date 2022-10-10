package irvine.oeis.a059;

import irvine.oeis.FilterSequence;

/**
 * A059764 Initial (unsafe) primes of Cunningham chains of first type with length exactly 5. Primes in A059453 which survive as primes just four "2p+1 iterations", forming chains of exactly 5 terms.
 * @author Sean A. Irvine
 */
public class A059764 extends FilterSequence {

  /** Construct the sequence. */
  public A059764() {
    super(new A059453(), k -> k.multiply(4).add(3).isProbablePrime()
      && k.multiply(8).add(7).isProbablePrime()
      && k.multiply(16).add(15).isProbablePrime()
      && !k.multiply(32).add(31).isProbablePrime());
  }
}
