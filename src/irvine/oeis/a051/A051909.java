package irvine.oeis.a051;

import irvine.oeis.FiniteSequence;

/**
 * A051909 Subset of strict Egyptian numbers - there is a unique representation of 1 as the sum of distinct unit fractions with the sum of denominators being these numbers.
 * @author Georg Fischer
 */
public class A051909 extends FiniteSequence {

  /** Construct the sequence. */
  public A051909() {
    super(1, FINITE, 1, 11, 24, 30, 31, 32, 37, 38, 43, 52, 53, 54, 55, 59, 60, 61, 65, 73, 75, 80, 91);
  }
}
