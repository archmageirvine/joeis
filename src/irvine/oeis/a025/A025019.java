package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025019 Smallest prime in Goldbach partition of <code>A025018(n)</code>.
 * @author Sean A. Irvine
 */
public class A025019 extends A025017 {

  private long mMax = 0;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long r = gold(mN);
      if (r > mMax) {
        mMax = r;
        return Z.valueOf(r);
      }
    }
  }
}

