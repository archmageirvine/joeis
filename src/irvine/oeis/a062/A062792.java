package irvine.oeis.a062;

import irvine.oeis.a002.A002110;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A062792 Moebius transform of primorial numbers.
 * @author Sean A. Irvine
 */
public class A062792 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A062792() {
    super(new A002110(), 1);
    next();
  }
}
