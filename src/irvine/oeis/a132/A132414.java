package irvine.oeis.a132;

import irvine.oeis.FiniteSequence;

/**
 * A132414 Integers n such that <code>n^3 - (n + 2)^2 + n + 4</code> is a square.
 * @author Georg Fischer
 */
public class A132414 extends FiniteSequence {

  /** Construct the sequence. */
  public A132414() {
    super(-1, 0, 3, 4, 75);
  }
}
