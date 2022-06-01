package irvine.oeis.a000;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A000496 Restricted permutations.
 * @author Sean A. Irvine
 */
public class A000496 extends GeneratingFunctionSequence {

  /* G.f. guessed by Georg Fischer with Mathematica: 
    (1 - x + 2*x^3 + 13*x^4 - 3*x^5 - 6*x^6 - 10*x^7 - 4*x^8)/(1 - 2*x + x^4)
  */

  /** Construct the sequence. */
  public A000496() {
    super(new long[] {1, -1, 0, 2, 13, -3, -6, -10, -4},
      new long[] {1, -2, 0, 0, 1});
  }
}
