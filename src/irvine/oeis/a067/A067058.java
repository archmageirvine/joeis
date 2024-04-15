package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067058 Numbers n such that sigma(n+2) - sigma(n) = prime(n+2) - prime(n).
 * @author Sean A. Irvine
 */
public class A067058 extends A000040 {

  private long mN = 2;
  private Z mP = super.next();
  private Z mQ = super.next();
  private Z mS = Z.ONE;
  private Z mT = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z r = mP;
      mP = mQ;
      mQ = super.next();
      final Z s = mS;
      mS = mT;
      mT = Functions.SIGMA.z(++mN);
      if (mT.subtract(s).equals(mQ.subtract(r))) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}

