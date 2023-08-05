package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a064.A064992;

/**
 * A065002 Integers m such that A064992(m) = A064992(m+1).
 * @author Sean A. Irvine
 */
public class A065002 extends A064992 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
