package irvine.oeis.a122;

import irvine.oeis.FiniteSequence;

/**
 * A122107 Numbers of the form (1+2n^2+4n^3)/(n+10).
 * @author Georg Fischer
 */
public class A122107 extends FiniteSequence {

  /** Construct the sequence. */
  public A122107() {
    super(-2753, 971, 5081, 8077, 54317, 85291, 57282481, 58179047);
  }
}
