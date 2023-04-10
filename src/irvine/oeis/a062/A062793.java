package irvine.oeis.a062;

import irvine.oeis.a000.A000312;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A062793 Moebius transform of n^n.
 * @author Sean A. Irvine
 */
public class A062793 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A062793() {
    super(new A000312(), 1);
    next();
  }
}
