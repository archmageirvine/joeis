package irvine.oeis.a031;

import irvine.oeis.FiniteSequence;

/**
 * A031871 Lexically first 8-mark Golomb ruler.
 * @author Georg Fischer
 */
public class A031871 extends FiniteSequence {

  /** Construct the sequence. */
  public A031871() {
    super(1, FINITE, 1, 2, 5, 10, 16, 23, 33, 35);
  }
}
