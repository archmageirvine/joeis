package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243543 Smallest number whose list of divisors contains n distinct digits <code>(in</code> base 10).
 * @author Georg Fischer
 */
public class A243543 extends FiniteSequence {

  /** Construct the sequence. */
  public A243543() {
    super(1, 2, 4, 6, 12, 18, 36, 72, 54, 108);
  }
}
