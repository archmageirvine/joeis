package irvine.oeis.a068;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A068443 Triangular numbers which are the product of two primes.
 * @author Sean A. Irvine
 */
public class A068443 extends FilterSequence {

  /** Construct the sequence. */
  public A068443() {
    super(1, new A000217(), SEMIPRIME);
  }
}

