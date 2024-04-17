package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A064026 Numbers k such that d(k) + d(k+1) + d(k+2) = 8, where d(k) = A001223.
 * @author Sean A. Irvine
 */
public class A064026 extends A001223 {

  private Z mA = super.next();
  private Z mB = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (t.add(mA).add(mB).equals(Z.EIGHT)) {
        return Z.valueOf(mN);
      }
    }
  }
}
