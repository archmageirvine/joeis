package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A065304 Numbers k such that A003285(k) = A003285(k+1) == 1 (mod 2).
 * @author Sean A. Irvine
 */
public class A065304 extends A003285 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.equals(mA) && t.isOdd() && mA.isOdd()) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
