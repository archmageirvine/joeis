package irvine.oeis.a217;

import irvine.oeis.FiniteSequence;

/**
 * A217396 The divisors of the primes {2, 3, 5, 7, 13}.
 * @author Georg Fischer
 */
public class A217396 extends FiniteSequence {

  /** Construct the sequence. */
  public A217396() {
    super(1, FINITE, 1, 2, 3, 5, 7, 13);
  }
}
