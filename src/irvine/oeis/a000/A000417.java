package irvine.oeis.a000;

import irvine.oeis.transform.EulerTransform;

/**
 * A000417 Euler transform of A000389.
 * @author Sean A. Irvine
 */
public class A000417 extends EulerTransform {

  /** Default constructor. */
  public A000417() {
    super(1, new A000389().skip(5));
  }
}
