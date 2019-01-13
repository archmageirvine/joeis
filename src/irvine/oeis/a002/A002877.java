package irvine.oeis.a002;

import irvine.oeis.InverseEulerTransformSequence;

/**
 * A002877.
 * @author Sean A. Irvine
 */
public class A002877 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A002877() {
    super(new A002876(), 0);
    next();
  }
}
