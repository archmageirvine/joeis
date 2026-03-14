package irvine.oeis.a084;

import irvine.oeis.FilterPositionSequence;

/**
 * A084146 Integers that have exactly one representation as a sum of two or more consecutive primes.
 * @author Sean A. Irvine
 */
public class A084146 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084146() {
    super(1, new A084143(), ONE);
  }
}
