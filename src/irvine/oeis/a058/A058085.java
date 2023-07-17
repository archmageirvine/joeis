package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058085 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A058085 extends A058057 {

  /** Construct the sequence. */
  public A058085() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return t(++mN, mN - 5);
  }
}

