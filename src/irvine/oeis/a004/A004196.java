package irvine.oeis.a004;

import irvine.oeis.FiniteSequence;

/**
 * A004196 The numbers not expressible as the sum of 4 distinct nonzero squares can be written <code>D*4^n</code> union E. This is E.
 * @author Sean A. Irvine
 */
public class A004196 extends FiniteSequence {

  /** Construct the sequence. */
  public A004196() {
    super(21, 29, 35, 41, 45, 49, 53, 59, 61, 69, 77, 83, 89, 101, 115, 157);
  }
}

