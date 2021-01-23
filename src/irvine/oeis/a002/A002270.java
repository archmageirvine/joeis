package irvine.oeis.a002;

import irvine.oeis.FiniteSequence;

/**
 * A002270 Composite n such that n*sigma(n) == 2 (mod phi(n)).
 * @author Sean A. Irvine
 */
public class A002270 extends FiniteSequence {

  /** Construct the sequence. */
  public A002270() {
    super(4, 6, 22);
  }
}

