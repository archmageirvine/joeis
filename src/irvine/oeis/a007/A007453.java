package irvine.oeis.a007;

import irvine.oeis.InverseEulerTransform;
import irvine.oeis.a003.A003430;

/**
 * A007453 Number of unlabeled connected series-parallel posets with n nodes.
 * @author Sean A. Irvine
 */
public class A007453 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A007453() {
    super(new A003430(), 1);
    next();
  }
}

