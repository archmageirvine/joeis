package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020592 Smallest nonempty set S containing prime divisors of 4k+7 for each k in S.
 * @author Georg Fischer
 */
public class A020592 extends FiniteSequence {

  /** Construct the sequence. */
  public A020592() {
    super(3, 5, 17, 19, 83, 113);
  }
}
