package irvine.oeis.a390;

import irvine.oeis.FilterSequence;
import irvine.oeis.a387.A387946;

/**
 * A390933 Primes that are (product minus sum) of a sequence of consecutive primes.
 * @author Sean A. Irvine
 */
public class A390933 extends FilterSequence {

  /** Construct the sequence. */
  public A390933() {
    super(new A387946(), PRIME);
  }
}
