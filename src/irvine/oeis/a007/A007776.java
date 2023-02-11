package irvine.oeis.a007;

import irvine.oeis.a049.A049312;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A007776 Number of connected posets with n elements of height 1.
 * @author Sean A. Irvine
 */
public class A007776 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A007776() {
    super(2, new A049312(), 1);
    next();
    next();
  }
}
