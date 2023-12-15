package irvine.oeis.a067;

import irvine.oeis.FilterSequence;
import irvine.oeis.a035.A035065;

/**
 * A067367 Primes p such that the number of digits in p! is also prime.
 * @author Sean A. Irvine
 */
public class A067367 extends FilterSequence {

  /** Construct the sequence. */
  public A067367() {
    super(new A035065(), PRIME);
  }
}
