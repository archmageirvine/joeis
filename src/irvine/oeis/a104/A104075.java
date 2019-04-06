package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104075 Repdigits, the squares of which are palindromes.
 * @author Georg Fischer
 */
public class A104075 extends FiniteSequence {

  /** Construct the sequence. */
  public A104075() {
    super(0, 1, 2, 3, 11, 22, 111, 1111, 11111, 111111, 1111111, 11111111, 111111111L);
  }
}
