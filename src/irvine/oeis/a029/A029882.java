package irvine.oeis.a029;

import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a001.A001285;

/**
 * A029882 Inverse Moebius transform of Thue-Morse sequence <code>A001285</code>.
 * @author Sean A. Irvine
 */
public class A029882 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A029882() {
    super(new A001285(), 0);
    next();
  }
}
