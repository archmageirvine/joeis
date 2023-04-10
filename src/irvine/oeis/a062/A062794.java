package irvine.oeis.a062;

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A062794 Moebius transform of n!.
 * @author Sean A. Irvine
 */
public class A062794 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A062794() {
    super(new A000142(), 1);
    next();
  }
}
