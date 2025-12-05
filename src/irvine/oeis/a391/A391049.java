package irvine.oeis.a391;

import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065091;

/**
 * A391049 Primes p such that p^2 - 4*q*r = s^2, where q, r are primes and s &gt; 0.
 * @author Sean A. Irvine
 */
public class A391049 extends FilterSequence {

  /** Construct the sequence. */
  public A391049() {
    super(1, new A065091(), p -> p.subtract(2).isProbablePrime() || p.divide2().isProbablePrime());
  }
}
