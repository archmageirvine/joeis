package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236210 Pairs of "harmonic numbers" 2^m * 3^n that differ by 1.
 * @author Georg Fischer
 */
public class A236210 extends FiniteSequence {

  /** Construct the sequence. */
  public A236210() {
    super(1, 2, 2, 3, 3, 4, 8, 9);
  }
}
