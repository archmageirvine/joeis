package irvine.oeis.a071;
// manually deris2/binomx at 2021-12-08 08:19

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A071014 Binomial transform of A002487.
 * @author Georg Fischer
 */
public class A071014 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A071014() {
    super(1, new A002487(), 2);
  }
}
