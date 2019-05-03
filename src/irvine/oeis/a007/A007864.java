package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a001.A001156;

/**
 * A007864 Number of matrix bundles of codimension <code>n (Euler</code> transform of <code>A001156)</code>.
 * @author Sean A. Irvine
 */
public class A007864 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007864() {
    super(new A001156(), 2);
    next();
  }
}
