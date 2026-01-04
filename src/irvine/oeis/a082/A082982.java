package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A082982 Numbers k such that k, k+1 and k+2 are sums of 2 squares.
 * @author Sean A. Irvine
 */
public class A082982 extends A001481 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mB.subtract(t).equals(Z.TWO)) {
        return t;
      }
    }
  }
}
