package irvine.oeis.a019;

import irvine.oeis.a010.A010060;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A019302 Binomial transform of Thue-Morse sequence A010060.
 * @author Sean A. Irvine
 */
public class A019302 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A019302() {
    super(new A010060(), 0);
  }
}

