package irvine.oeis.a069;

import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065220;

/**
 * A069109 Primes of the form F(k)-k where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A069109 extends FilterSequence {

  /** Construct the sequence. */
  public A069109() {
    super(1, new A065220(), PRIME);
  }
}

