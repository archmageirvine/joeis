package irvine.oeis.a085;

import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003348;

/**
 * A085319 Primes which are the sum of three 5th powers.
 * @author Sean A. Irvine
 */
public class A085319 extends FilterSequence {

  /** Construct the sequence. */
  public A085319() {
    super(1, new A003348(), PRIME);
  }
}
