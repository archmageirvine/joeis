package irvine.oeis.a024;

import irvine.oeis.FiniteSequence;

/**
 * A024774 Every prefix and suffix prime in base 6 (written in base 6).
 * @author Georg Fischer
 */
public class A024774 extends FiniteSequence {

  /** Construct the sequence. */
  public A024774() {
    super(1, FINITE, 2, 3, 5, 25, 35, 215, 515, 2115, 3515);
  }
}
