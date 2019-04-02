package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a002.A002426;

/**
 * A007987 Number of irreducible words of length 2n in the free group with generators x,y such that the total degree of x and the total degree of y both equal zero.
 * @author Sean A. Irvine
 */
public class A007987 extends A002426 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next().square();
    return mA.subtract(t);
  }
}
