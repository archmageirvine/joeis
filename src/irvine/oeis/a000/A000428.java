package irvine.oeis.a000;

import irvine.oeis.EulerTransformSequence;

/**
 * A000428.
 * @author Sean A. Irvine
 */
public class A000428 extends EulerTransformSequence {

  /** Default constructor. */
  public A000428() {
    super(new A000579(), 6);
    next();
  }
}
