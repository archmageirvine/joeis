package irvine.oeis.a168;

import irvine.oeis.FiniteSequence;

/**
 * A168257 Numbers k with property that 4 + 2*k + 3*k^3 is a square.
 * @author Georg Fischer
 */
public class A168257 extends FiniteSequence {

  /** Construct the sequence. */
  public A168257() {
    super(0, 1, 9, 784);
  }
}
