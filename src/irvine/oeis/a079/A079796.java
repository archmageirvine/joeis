package irvine.oeis.a079;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A079796 Primes p such that (3*p)^2 + p^2 + 3^2 and (3*p)^2 - p^2 - 3^2 are both prime.
 * @author Sean A. Irvine
 */
public class A079796 extends FilterSequence {

  /** Construct the sequence. */
  public A079796() {
    super(new A000040(), p -> p.square().multiply(10).add(9).isProbablePrime() && p.square().multiply(8).subtract(9).isProbablePrime());
  }
}

