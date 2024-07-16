package irvine.oeis.a059;

import irvine.oeis.FilterSequence;

/**
 * A059762 Initial primes of Cunningham chains of first type with length exactly 3. Primes in A059453 that survive as primes just two "2p+1 iterations", forming chains of exactly 3 terms.
 * @author Sean A. Irvine
 */
public class A059762 extends FilterSequence {

  /** Construct the sequence. */
  public A059762() {
    super(0, new A059453(), k -> k.multiply(4).add(3).isProbablePrime()
      && !k.multiply(8).add(7).isProbablePrime());
  }
}
