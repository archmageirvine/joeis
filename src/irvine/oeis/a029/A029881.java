package irvine.oeis.a029;

import irvine.oeis.a001.A001285;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A029881 Moebius transform of Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029881 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A029881() {
    super(0, new A001285(), 0);
    next();
  }
}
