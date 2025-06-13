package irvine.oeis.a077;

import irvine.oeis.Combiner;

/**
 * A077762 Number of ways of pairing the squares of the numbers 1 to n with the squares of the numbers n+1 to 2n such that each pair sums to a prime. Because an odd square must always be added to an even square to obtain a prime, this sequence is the product of A077763 and A077764.
 * @author Sean A. Irvine
 */
public class A077762 extends Combiner {

  /** Construct the sequence. */
  public A077762() {
    super(1, new A077763(), new A077764(), MULTIPLY);
  }

}

