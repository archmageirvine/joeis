package irvine.oeis.a002;

import irvine.oeis.FiniteSequence;

/**
 * A002270 Composite numbers k such that k*sigma(k) == 2 (mod phi(k)).
 * @author Sean A. Irvine
 */
public class A002270 extends FiniteSequence {

  /** Construct the sequence. */
  public A002270() {
    super(1, FINITE, 4, 6, 22);
  }
}

