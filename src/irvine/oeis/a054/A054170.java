package irvine.oeis.a054;

import irvine.oeis.a000.A000013;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A054170 Moebius transform of A000013 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054170 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A054170() {
    super(new A000013(), 0);
    next();
  }
}
