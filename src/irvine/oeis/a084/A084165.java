package irvine.oeis.a084;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002313;

/**
 * A084165 Primes which are 1 (mod m), where m is the index of the prime in sequence A002313 (Real primes with corresponding complex primes).
 * @author Sean A. Irvine
 */
public class A084165 extends FilterSequence {

  /** Construct the sequence. */
  public A084165() {
    super(1, new A002313(), (n, k) -> k.mod(n) == 1 % n);
  }
}

