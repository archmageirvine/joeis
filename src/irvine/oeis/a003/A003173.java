package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003173 Heegner numbers: imaginary quadratic fields with unique factorization (or class number 1).
 * @author Sean A. Irvine
 */
public class A003173 extends FiniteSequence {

  /** Construct the sequence. */
  public A003173() {
    super(1, 2, 3, 7, 11, 19, 43, 67, 163);
  }
}

