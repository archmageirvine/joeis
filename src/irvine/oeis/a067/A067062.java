package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067062 Numbers k such that sigma(k+2) - sigma(k) = prime(k+1) - prime(k).
 * @author Sean A. Irvine
 */
public class A067062 extends A000040 {

  private long mN = 2;
  private Z mP = super.next();
  private Z mS = Z.ONE;
  private Z mT = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      final Z s = mS;
      mS = mT;
      mT = Functions.SIGMA1.z(++mN);
      if (mT.subtract(s).equals(mP.subtract(q))) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}

