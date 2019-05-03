package irvine.oeis.a019;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a010.A010059;

/**
 * A019301 Binomial transform of Thue-Morse sequence <code>A010059</code>.
 * @author Sean A. Irvine
 */
public class A019301 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A019301() {
    super(new A010059(), 0);
  }
}

