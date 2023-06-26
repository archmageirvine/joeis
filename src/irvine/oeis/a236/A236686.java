package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236686 Possible values for positive integers a,b,c,d such that 1/a + 1/b + 1/c + 1/d = 1.
 * @author Georg Fischer
 */
public class A236686 extends FiniteSequence {

  /** Construct the sequence. */
  public A236686() {
    super(1, FINITE, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 20, 24, 42);
  }
}
