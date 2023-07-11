package irvine.oeis.a054;

import irvine.oeis.a000.A000048;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A054174 Moebius transform of A000048 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054174 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A054174() {
    super(0, new A000048(), 0);
    next();
  }
}
