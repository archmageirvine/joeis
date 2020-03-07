package irvine.oeis.a029;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a001.A001285;

/**
 * A029879 Binomial transform of Thue-Morse sequence <code>A001285</code>.
 * @author Sean A. Irvine
 */
public class A029879 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A029879() {
    super(new A001285(), 0);
  }
}
