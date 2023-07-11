package irvine.oeis.a029;

import irvine.oeis.a001.A001285;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A029882 Inverse Moebius transform of Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029882 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A029882() {
    super(0, new A001285(), 0);
    next();
  }
}
