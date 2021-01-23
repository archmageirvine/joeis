package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178726 Smallest nonnegative integer whose English name has no letters in common with the English name of the previous term (starting with 0).
 * @author Georg Fischer
 */
public class A178726 extends FiniteSequence {

  /** Construct the sequence. */
  public A178726() {
    super(0, 6, 1, 30, 7, 2, 5, 2000);
  }
}
