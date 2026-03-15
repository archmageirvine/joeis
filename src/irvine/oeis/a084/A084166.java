package irvine.oeis.a084;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002313;

/**
 * A084166 Index of the primes in A084165.
 * @author Sean A. Irvine
 */
public class A084166 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084166() {
    super(1, 1, new A002313(), (n, k) -> k.mod(n) == 1 % n);
  }
}

