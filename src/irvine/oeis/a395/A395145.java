package irvine.oeis.a395;

import irvine.oeis.FiniteSequence;

/**
 * A395145 Maximum number of ISO A(n) sheets that fit orthogonally without overlap into a single ISO A0 sheet.
 * @author Sean A. Irvine
 */
public class A395145 extends FiniteSequence {

  /** Construct the sequence. */
  public A395145() {
    super(0, FINITE, 1, 2, 4, 8, 16, 32, 64, 128, 258, 516, 1038);
  }
}

