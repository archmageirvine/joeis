package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001881 Coefficients of Bessel polynomials y_n (x).
 * @author Sean A. Irvine
 */
public class A001881 extends A001497 {

  /** Construct the sequence. */
  public A001881() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
