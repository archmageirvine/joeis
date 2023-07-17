package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058089 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A058089 extends A058087 {

  /** Construct the sequence. */
  public A058089() {
    super(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    return t(++mN, mN - 6);
  }
}

