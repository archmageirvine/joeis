package irvine.oeis.a062;

import irvine.oeis.a000.A000396;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A062819 Values of inverse Moebius transform of perfect numbers, A000396.
 * @author Sean A. Irvine
 */
public class A062819 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A062819() {
    super(0, new A000396(), 0);
    next();
  }
}
