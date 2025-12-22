package irvine.oeis.a141;

import irvine.oeis.FiniteSequence;

/**
 * A141399 Positive integers k such that all the distinct primes that divide k or k+1 are members of a set of consecutive primes. In other words, k is included if and only if k*(k+1) is contained in sequence A073491.
 * @author Sean A. Irvine
 */
public class A141399 extends FiniteSequence {

  /** Construct the sequence. */
  public A141399() {
    super(1, FINITE, 1, 2, 3, 5, 8, 9, 14, 15, 20, 24, 35, 80, 125, 224, 384, 440, 539, 714, 1715, 2079, 2400, 3024, 4374, 9800, 12375, 123200, 194480, 633555);
  }
}
