package irvine.oeis.a054;

import irvine.oeis.a000.A000029;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A054156 Moebius transform of A000029 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054156 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A054156() {
    super(0, new A000029(), 0);
    next();
  }
}
