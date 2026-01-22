package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018229 Numbers k such that normalizer of Gamma_0(k) is triangle group (2,4,inf).
 * @author Sean A. Irvine
 */
public class A018229 extends FiniteSequence {

  /** Construct the sequence. */
  public A018229() {
    super(1, FINITE, 2, 8, 18, 32, 72, 128, 288, 1152);
  }
}

