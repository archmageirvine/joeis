package irvine.oeis.a019;

import irvine.oeis.a010.A010059;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A019301 Binomial transform of Thue-Morse sequence A010059.
 * @author Sean A. Irvine
 */
public class A019301 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A019301() {
    super(new A010059(), 0);
  }
}

