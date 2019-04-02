package irvine.oeis.a000;

import irvine.oeis.EulerTransformSequence;

/**
 * A000417 Euler transform of A000389.
 * @author Sean A. Irvine
 */
public class A000417 extends EulerTransformSequence {

  /** Default constructor. */
  public A000417() {
    super(new A000389(), 5);
    next();
  }
}
