package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171826 Nonnegative integers that can be made using exactly three threes <code>(3 3's)</code> and the four basic operators <code>{+, -, *, /}</code>.
 * @author Georg Fischer
 */
public class A171826 extends FiniteSequence {

  /** Construct the sequence. */
  public A171826() {
    super(0, 2, 3, 4, 6, 9, 12, 18, 27);
  }
}
