package irvine.oeis.a007;

import irvine.oeis.a000.A000670;
import irvine.oeis.transform.EulerTransform;

/**
 * A007003 Euler transform of numbers of preferential arrangements.
 * @author Sean A. Irvine
 */
public class A007003 extends EulerTransform {

  /** Construct the sequence. */
  public A007003() {
    super(new A000670(), 0);
    next();
  }
}

