package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020615 Smallest nonempty set S containing prime divisors of 8k+1 for each k in S.
 * @author Georg Fischer
 */
public class A020615 extends FiniteSequence {

  /** Construct the sequence. */
  public A020615() {
    super(3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 59, 67, 83, 89, 97, 103, 109, 131, 137, 179, 199, 233, 373, 1049, 1097, 1223, 1433, 2293);
  }
}
