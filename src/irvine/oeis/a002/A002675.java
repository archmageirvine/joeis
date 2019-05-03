package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002675 Numerators of coefficients for central differences <code>M_{4}^(2*n)</code>.
 * @author Sean A. Irvine
 */
public class A002675 extends A002672 {

  private int mN = 2;

  @Override
  public Z next() {
    mN += 2;
    return bigM(4, mN).num();
  }
}
