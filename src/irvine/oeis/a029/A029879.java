package irvine.oeis.a029;

import irvine.oeis.a001.A001285;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A029879 Binomial transform of Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029879 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A029879() {
    super(new A001285(), 0);
  }
}
