package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a008.A008287;

/**
 * A005724 Quadrinomial coefficients.
 * @author Sean A. Irvine
 */
public class A005724 extends A008287 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return quadrinomial(mN, 3 * mN / 2 - 1);
  }
}

