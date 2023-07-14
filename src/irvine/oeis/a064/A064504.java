package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064504 Numbers k such that prime(k) + prime(k+1)*2 is a square.
 * @author Sean A. Irvine
 */
public class A064504 extends A000040 {

  private Z mP = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z q = mP;
      mP = super.next();
      if (q.add(mP.multiply2()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
