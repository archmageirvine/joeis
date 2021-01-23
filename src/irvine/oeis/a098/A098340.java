package irvine.oeis.a098;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a012.A012000;

/**
 * A098340 Expansion of 1/sqrt(1 - 6x + 21x^2).
 * @author Sean A. Irvine
 */
public class A098340 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A098340() {
    super(new A012000(), 0);
  }
}
