package irvine.oeis.a392;

import irvine.oeis.a016.A016116;
import irvine.oeis.transform.EulerTransform;

/**
 * A392561 Euler transform of A016116 = 2^floor(n/2).
 * @author Sean A. Irvine
 */
public class A392561 extends EulerTransform {

  /** Construct the sequence. */
  public A392561() {
    super(0, new A016116(), 1);
  }
}
