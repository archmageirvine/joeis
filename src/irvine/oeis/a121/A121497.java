package irvine.oeis.a121;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010051;

/**
 * A121497 Binomial transform of the characteristic function of the prime numbers (A010051).
 * @author Sean A. Irvine
 */
public class A121497 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A121497() {
    super(new PrependSequence(new A010051(), 0), 0);
  }
}
