package irvine.oeis.a059;

import irvine.oeis.FilterSequence;

/**
 * A059766 Initial (unsafe) primes of Cunningham chains of first type with length exactly 6.
 * @author Sean A. Irvine
 */
public class A059766 extends FilterSequence {

  /** Construct the sequence. */
  public A059766() {
    super(new A059453(), k -> k.multiply(4).add(3).isProbablePrime()
      && k.multiply(8).add(7).isProbablePrime()
      && k.multiply(16).add(15).isProbablePrime()
      && k.multiply(32).add(31).isProbablePrime()
      && !k.multiply(64).add(63).isProbablePrime());
  }
}
