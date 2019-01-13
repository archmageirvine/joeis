package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a001.A001156;

/**
 * A007864.
 * @author Sean A. Irvine
 */
public class A007864 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007864() {
    super(new A001156(), 2);
    next();
  }
}
