package irvine.oeis.a048;

import irvine.oeis.FilterSequence;

/**
 * A048389 Primes resulting from procedure described in A048388.
 * @author Sean A. Irvine
 */
public class A048389 extends FilterSequence {

  /** Construct the sequence. */
  public A048389() {
    super(1, new A048385(), PRIME);
  }
}
