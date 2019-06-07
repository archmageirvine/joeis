package irvine.oeis.a084;

import irvine.oeis.FiniteSequence;

/**
 * A084303 Smallest x such that <code>sigma(x) mod 6 = n</code>.
 * @author Georg Fischer
 */
public class A084303 extends FiniteSequence {

  /** Construct the sequence. */
  public A084303() {
    super(5, 1, 7, 2, 3, 2401);
  }
}
