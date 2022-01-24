package irvine.oeis.a054;

import irvine.oeis.a000.A000011;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A054183 Moebius transform of A000011 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054183 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A054183() {
    super(new A000011(), 0);
    next();
  }
}
