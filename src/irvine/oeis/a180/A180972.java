package irvine.oeis.a180;

import irvine.oeis.FiniteSequence;

/**
 * A180972 Numbers n such that <code>8^9 + n^2</code> is a square.
 * @author Georg Fischer
 */
public class A180972 extends FiniteSequence {

  /** Construct the sequence. */
  public A180972() {
    super(4096, 14336, 31744, 65024, 130816, 262016, 524224, 1048544, 2097136, 4194296, 8388604, 16777214, 33554431);
  }
}
