package irvine.oeis.a062;

import irvine.oeis.a000.A000396;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A062818 Values of Moebius transform of perfect numbers, A000396.
 * @author Sean A. Irvine
 */
public class A062818 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A062818() {
    super(new A000396(), 0);
    next();
  }
}
