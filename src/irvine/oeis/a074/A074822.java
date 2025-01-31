package irvine.oeis.a074;

import irvine.oeis.FilterSequence;
import irvine.oeis.a030.A030433;

/**
 * A074822 Primes p such that p + 4 is prime and p == 9 (mod 10).
 * @author Sean A. Irvine
 */
public class A074822 extends FilterSequence {

  /** Construct the sequence. */
  public A074822() {
    super(1, new A030433(), p -> p.add(4).isProbablePrime());
  }
}
