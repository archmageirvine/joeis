package irvine.oeis.a029;

import irvine.oeis.a001.A001285;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A029881 M\u00f6bius transform of Thue-Morse sequence A001285 (when shifted once right).
 * @author Sean A. Irvine
 */
public class A029881 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A029881() {
    super(1, new A001285(), 0);
    next();
  }
}
