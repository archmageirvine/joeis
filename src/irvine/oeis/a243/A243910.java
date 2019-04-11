package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243910 Least number <code>k&gt;0</code> such that <code>3^k</code> contains exactly n different digits.
 * @author Georg Fischer
 */
public class A243910 extends FiniteSequence {

  /** Construct the sequence. */
  public A243910() {
    super(1, 3, 5, 7, 9, 13, 15, 24, 30, 39);
  }
}
