package irvine.oeis.a069;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A069142 Primes p such that p+2, 2p+1, and 2p+3 are also prime.
 * @author Sean A. Irvine
 */
public class A069142 extends FilterSequence {

  /** Construct the sequence. */
  public A069142() {
    super(1, new A001359(), p -> p.multiply2().add(1).isProbablePrime() && p.multiply2().add(3).isProbablePrime());
  }
}

