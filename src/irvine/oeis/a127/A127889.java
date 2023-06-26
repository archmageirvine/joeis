package irvine.oeis.a127;

import irvine.oeis.FiniteSequence;

/**
 * A127889 Smallest n-digit right-truncatable prime.
 * @author Georg Fischer
 */
public class A127889 extends FiniteSequence {

  /** Construct the sequence. */
  public A127889() {
    super(1, FINITE, 2, 23, 233, 2333, 23333, 233993, 2339933, 23399339);
  }
}
