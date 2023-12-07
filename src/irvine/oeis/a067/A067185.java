package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067185.
 * @author Sean A. Irvine
 */
public class A067185 extends A000040 {

  private long mN = 0;
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      if (++mN == 1 || mP.add(q).mod(mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

