package irvine.oeis.a054;

import irvine.oeis.a000.A000048;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A054172 Inverse Moebius transform of A000048 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054172 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A054172() {
    super(0, new A000048(), 0);
    next();
  }
}
