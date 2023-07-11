package irvine.oeis.a080;
// manually binomx at 2021-12-07

import irvine.oeis.a002.A002872;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A080337 Bisection of A080107.
 * @author Georg Fischer
 */
public class A080337 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A080337() {
    super(1, new A002872(), 0);
  }
}
