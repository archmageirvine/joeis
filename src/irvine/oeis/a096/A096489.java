package irvine.oeis.a096;

import irvine.oeis.FiniteSequence;

/**
 * A096489 Noncomposite numbers n such that number of decimal digits of n = number of divisors of n.
 * @author Georg Fischer
 */
public class A096489 extends FiniteSequence {

  /** Construct the sequence. */
  public A096489() {
    super(1, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
  }
}
