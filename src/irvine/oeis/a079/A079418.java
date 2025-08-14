package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079418 Numbers k such that prime(k)/k &lt; prime(k-1)/(k-1).
 * @author Sean A. Irvine
 */
public class A079418 extends A000040 {

  private long mN = 1;
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z q = mP;
      mP = super.next();
      if (mP.multiply(mN - 1).compareTo(q.multiply(mN)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

