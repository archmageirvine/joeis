package irvine.oeis.a049;

import irvine.oeis.transform.EulerTransform;

/**
 * A049339 Number of n-node planar graphs with even degrees.
 * @author Sean A. Irvine
 */
public class A049339 extends EulerTransform {

  /** Construct the sequence. */
  public A049339() {
    super(new A049365());
  }
}
