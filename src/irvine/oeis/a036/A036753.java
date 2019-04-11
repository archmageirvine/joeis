package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036753 Number of strings of n distinct digits from <code>0-9</code> that are the last n digits of a square in base 9.
 * @author Georg Fischer
 */
public class A036753 extends FiniteSequence {

  /** Construct the sequence. */
  public A036753() {
    super(4, 27, 189, 1134, 5670, 22680, 68040, 136080, 136080);
  }
}
