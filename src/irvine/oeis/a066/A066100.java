package irvine.oeis.a066;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A066100 Primes p such that p^6 + p^3 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A066100 extends FilterSequence {

  /** Construct the sequence. */
  public A066100() {
    super(1, new A000040(), p -> p.pow(6).add(p.pow(3)).add(1).isProbablePrime());
  }
}
