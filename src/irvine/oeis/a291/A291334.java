package irvine.oeis.a291;

import irvine.oeis.FiniteSequence;

/**
 * A291334 Numbers with two or more digits such that every two consecutive digits are a square.
 * @author Georg Fischer
 */
public class A291334 extends FiniteSequence {

  /** Construct the sequence. */
  public A291334() {
    super(1, FINITE, 16, 25, 36, 49, 64, 81, 164, 364, 649, 816, 1649, 3649, 8164, 81649);
  }
}
