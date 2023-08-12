package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A065059 Primes p such that prime(p) + pi(p) is a prime.
 * @author Sean A. Irvine
 */
public class A065059 extends FilterSequence {

  /** Construct the sequence. */
  public A065059() {
    super(new A065042(), Z::isProbablePrime);
  }
}

