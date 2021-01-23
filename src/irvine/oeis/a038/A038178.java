package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038178 n = (sum of digits of n)^(number of digits of n).
 * @author Georg Fischer
 */
public class A038178 extends FiniteSequence {

  /** Construct the sequence. */
  public A038178() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 81, 512, 2401);
  }
}
