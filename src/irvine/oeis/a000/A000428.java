package irvine.oeis.a000;

import irvine.oeis.EulerTransformSequence;

/**
 * A000428 Euler transform of <code>A000579</code>.
 * @author Sean A. Irvine
 */
public class A000428 extends EulerTransformSequence {

  /** Default constructor. */
  public A000428() {
    super(new A000579(), 6);
    next();
  }
}
