package irvine.oeis.a323;

import irvine.oeis.FiniteSequence;

/**
 * A323999 Start with 348, then successively apply <code>/12, -11, *10, /9, -8, *7, /6, -5, *4, /3, -2, *1</code>.
 * @author Georg Fischer
 */
public class A323999 extends FiniteSequence {

  /** Construct the sequence. */
  public A323999() {
    super(348, 29, 18, 180, 20, 12, 84, 14, 9, 36, 12, 10, 10);
  }
}
