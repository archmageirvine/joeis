package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001880 Coefficients of Bessel polynomials y_n (x).
 * @author Sean A. Irvine
 */
public class A001880 extends A001497 {

  /** Construct the sequence. */
  public A001880() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
