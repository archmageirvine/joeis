package irvine.oeis.a059;

import irvine.oeis.FilterSequence;

/**
 * A059763 Primes starting a Cunningham chain of the first kind of length 4.
 * @author Sean A. Irvine
 */
public class A059763 extends FilterSequence {

  /** Construct the sequence. */
  public A059763() {
    super(new A059453(), k -> k.multiply(4).add(3).isProbablePrime()
      && k.multiply(8).add(7).isProbablePrime()
      && !k.multiply(16).add(15).isProbablePrime());
  }
}
