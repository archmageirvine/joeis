package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018228 Numbers n such that normalizer of <code>Gamma_0(n)</code> is triangle group <code>(2,3,inf)</code>.
 * @author Sean A. Irvine
 */
public class A018228 extends FiniteSequence {

  /** Construct the sequence. */
  public A018228() {
    super(1, 4, 9, 16, 36, 64, 144, 576);
  }
}

