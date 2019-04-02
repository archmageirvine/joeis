package irvine.oeis.a007;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a000.A000670;

/**
 * A007003 Euler transform of numbers of preferential arrangements.
 * @author Sean A. Irvine
 */
public class A007003 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A007003() {
    super(new A000670(), 0);
    next();
  }
}

