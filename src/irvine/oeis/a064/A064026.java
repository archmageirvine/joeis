package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A064026 Numbers n such that d(n) + d(n+1) + d(n+2) = 8, where d(n) = A001223.
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
