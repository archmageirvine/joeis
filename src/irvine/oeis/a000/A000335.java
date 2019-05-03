package irvine.oeis.a000;

import irvine.oeis.EulerTransformSequence;

/**
 * A000335 Euler transform of <code>A000292</code>.
 * @author Sean A. Irvine
 */
public class A000335 extends EulerTransformSequence {

  /** Default constructor. */
  public A000335() {
    super(new A000292(), 1);
    next();
  }
}
