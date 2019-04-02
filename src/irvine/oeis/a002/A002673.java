package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002673 Numerators of central difference coefficients M_{3}^(2n+1).
 * @author Sean A. Irvine
 */
public class A002673 extends A002672 {

  private int mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return bigM(3, mN).num();
  }
}
