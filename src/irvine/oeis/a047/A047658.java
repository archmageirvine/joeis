package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A047658 Numbers n such that the initial n digits in decimal portion of Pi form a prime number.
 * @author Sean A. Irvine
 */
public class A047658 extends A000796 {

  {
    super.next(); // skip 3
  }
  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(10).add(super.next());
      if (mA.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
