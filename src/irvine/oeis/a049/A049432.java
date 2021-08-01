package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A049432 Numbers n such that n!-(n-1)!+1 is prime.
 * @author Sean A. Irvine
 */
public class A049432 extends A000142 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      ++mN;
      if (mA.subtract(t).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
