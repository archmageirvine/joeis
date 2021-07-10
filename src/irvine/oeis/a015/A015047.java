package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A015047 Numbers k such that S(k) = S(k-1) + S(k-2) where S is the Kempner function A002034.
 * @author Sean A. Irvine
 */
public class A015047 extends A002034 {

  private Z mA = super.next();
  private Z mB = super.next();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (t.add(mA).equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}
