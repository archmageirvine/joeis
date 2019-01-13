package irvine.oeis.a000;

import irvine.oeis.EulerTransformSequence;

/**
 * A000391.
 * @author Sean A. Irvine
 */
public class A000391 extends EulerTransformSequence {

  /** Default constructor. */
  public A000391() {
    super(new A000332(), 4);
    next();
  }
}
