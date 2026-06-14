package irvine.oeis.a085;

import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003337;

/**
 * A085318 Primes which are the sum of three positive 4th powers.
 * @author Sean A. Irvine
 */
public class A085318 extends FilterSequence {

  /** Construct the sequence. */
  public A085318() {
    super(1, new A003337(), PRIME);
  }
}
