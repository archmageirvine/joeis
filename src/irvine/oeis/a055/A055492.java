package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055492 Numbers n such that <code>LCM{1</code>, ..., <code>n}</code> is a minimal number.
 * @author Georg Fischer
 */
public class A055492 extends FiniteSequence {

  /** Construct the sequence. */
  public A055492() {
    super(1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 16, 27, 28);
  }
}
