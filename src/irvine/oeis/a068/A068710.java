package irvine.oeis.a068;

import irvine.oeis.a000.A000040;

/**
 * A068710 Primes whose digits can be arranged in increasing cyclic order - to form a substring of 123456789012345678901234567890...
 * @author Sean A. Irvine
 */
public class A068710 extends A068708 {

  /** Construct the sequence. */
  public A068710() {
    super(new A000040());
  }
}
