package irvine.oeis.a034;

import irvine.oeis.FiniteSequence;

/**
 * A034189 Number of binary codes of length 4 with n words.
 * @author Georg Fischer
 */
public class A034189 extends FiniteSequence {

  /** Construct the sequence. */
  public A034189() {
    super(1, 1, 4, 6, 19, 27, 50, 56, 74, 56, 50, 27, 19, 6, 4, 1, 1);
  }
}
