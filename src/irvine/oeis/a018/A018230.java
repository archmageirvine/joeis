package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018230 Numbers n such that normalizer of <code>Gamma_0(n)</code> is triangle group <code>(2,6,inf)</code>.
 * @author Sean A. Irvine
 */
public class A018230 extends FiniteSequence {

  /** Construct the sequence. */
  public A018230() {
    super(3, 12, 27, 48, 108, 192, 432, 1728);
  }
}

