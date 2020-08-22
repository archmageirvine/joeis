package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018228 Numbers n such that normalizer of Gamma_0(n) is triangle group (2,3,inf).
 * @author Sean A. Irvine
 */
public class A018228 extends FiniteSequence {

  /** Construct the sequence. */
  public A018228() {
    super(1, 4, 9, 16, 36, 64, 144, 576);
  }
}

