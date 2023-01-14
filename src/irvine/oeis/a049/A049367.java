package irvine.oeis.a049;

import irvine.oeis.transform.EulerTransform;

/**
 * A049367 Number of triangle-free planar graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A049367 extends EulerTransform {

  /** Construct the sequence. */
  public A049367() {
    super(1, new A049368());
  }
}
