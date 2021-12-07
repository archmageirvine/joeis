package irvine.oeis.a080;
// manually binomx at 2021-12-07

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a002.A002872;

/**
 * A080337 Bisection of A080107.
 * @author Georg Fischer
 */
public class A080337 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A080337() {
    super(new A002872(), 0);
  }
}
