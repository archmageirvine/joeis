package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000181 a(n) = A058087(n,n-4).
 * @author Sean A. Irvine
 */
public class A000181 extends A000159 {

  /** Construct the sequence. */
  public A000181() {
    super(4);
  }

  private int mA181 = 3;

  @Override
  public Z next() {
    return menageHitPolynomial(++mA181).coeff(4);
  }
}
