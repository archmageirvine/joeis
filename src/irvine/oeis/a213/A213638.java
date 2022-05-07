package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.a007.A007978;

/**
 * A213638 Positions of 2 in A213636.
 * @author Georg Fischer
 */
public class A213638 extends A007978 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(super.next()).equals(Z.TWO)) {
        return mN;
      }
    }
  }
}
