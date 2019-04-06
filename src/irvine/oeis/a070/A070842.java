package irvine.oeis.a070;

import irvine.oeis.FiniteSequence;

/**
 * A070842 Smallest n-digit number with exactly n prime divisors. There are no further terms.
 * @author Georg Fischer
 */
public class A070842 extends FiniteSequence {

  /** Construct the sequence. */
  public A070842() {
    super(2, 10, 102, 1020, 10010, 101010, 1009470, 11741730, 223092870L, 6469693230L);
  }
}
