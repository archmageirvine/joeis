package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072666 Numbers n such that prime(n) + prime(n+1) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A072666 extends A000040 {

  private Z mP = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z q = mP;
      mP = super.next();
      if (mP.add(q).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
