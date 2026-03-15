package irvine.oeis.a084;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002313;

/**
 * A084163 Primes which are -1 mod m, where m is the index of the prime in sequence A002313 (Real primes with corresponding complex primes). The index m can be found in A084164 Primes which are 1 mod m can be found in sequence A084165.
 * @author Sean A. Irvine
 */
public class A084163 extends FilterSequence {

  /** Construct the sequence. */
  public A084163() {
    super(1, new A002313(), (n, k) -> k.mod(n) == n - 1);
  }
}

