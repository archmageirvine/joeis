package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018230 Numbers n such that normalizer of Gamma_0(n) is triangle group (2,6,inf).
 * @author Sean A. Irvine
 */
public class A018230 extends FiniteSequence {

  /** Construct the sequence. */
  public A018230() {
    super(1, FINITE, 3, 12, 27, 48, 108, 192, 432, 1728);
  }
}

