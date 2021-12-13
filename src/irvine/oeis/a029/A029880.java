package irvine.oeis.a029;

import irvine.oeis.transform.InverseBinomialTransformSequence;
import irvine.oeis.a001.A001285;

/**
 * A029880 Inverse binomial transform of Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029880 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A029880() {
    super(new A001285(), 0);
  }
}
