package irvine.oeis.a054;

import irvine.oeis.a000.A000013;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A054168 Inverse Moebius transform of A000013 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054168 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A054168() {
    super(0, new A000013(), 0);
    next();
  }
}
