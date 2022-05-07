package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.a007.A007978;

/**
 * A213637 Values of n for which A213636(n) = 1.
 * @author Georg Fischer
 */
public class A213637 extends A007978 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(super.next()).equals(Z.ONE)) {
        return mN;
      }
    }
  }
}
