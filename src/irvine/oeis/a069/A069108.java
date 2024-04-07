package irvine.oeis.a069;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002062;

/**
 * A069108 Primes of the form F(k)+k where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A069108 extends FilterSequence {

  /** Construct the sequence. */
  public A069108() {
    super(1, new A002062(), PRIME);
  }
}

