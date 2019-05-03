package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018229 Numbers n such that normalizer of <code>Gamma_0(n)</code> is triangle group <code>(2,4,inf)</code>.
 * @author Sean A. Irvine
 */
public class A018229 extends FiniteSequence {

  /** Construct the sequence. */
  public A018229() {
    super(2, 8, 18, 32, 72, 128, 288, 1152);
  }
}

