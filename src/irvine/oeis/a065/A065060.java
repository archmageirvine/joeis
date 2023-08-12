package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A065060 Primes p such that prime(p) - pi(p) is a prime.
 * @author Sean A. Irvine
 */
public class A065060 extends FilterSequence {

  /** Construct the sequence. */
  public A065060() {
    super(new A065046(), Z::isProbablePrime);
  }
}

