package irvine.oeis.a128;

import irvine.oeis.FiniteSequence;

/**
 * A128700 Highly abundant numbers with an odd divisor sum.
 * @author Georg Fischer
 */
public class A128700 extends FiniteSequence {

  /** Construct the sequence. */
  public A128700() {
    super(1, 2, 4, 8, 16, 18, 36, 72, 144, 288, 1800, 3600, 7200);
  }
}
