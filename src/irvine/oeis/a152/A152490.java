package irvine.oeis.a152;

import irvine.oeis.FiniteSequence;

/**
 * A152490 Determinants of first <code>4x4</code> part of A051731 whose columns has been shifted with sequence A152489.
 * @author Georg Fischer
 */
public class A152490 extends FiniteSequence {

  /** Construct the sequence. */
  public A152490() {
    super(1, 0, -1, 0, 0, 1, 0, -1, -1, -1, 1, 1, -1, 0, 1, 0, 0, -1, 0, 1, 1, 1, -1, -1);
  }
}
