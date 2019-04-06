package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020612 Smallest nonempty set S containing prime divisors of 7k+8 for each k in S.
 * @author Georg Fischer
 */
public class A020612 extends FiniteSequence {

  /** Construct the sequence. */
  public A020612() {
    super(3, 5, 11, 13, 17, 23, 29, 43, 103, 127, 211);
  }
}
