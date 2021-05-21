package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025018 Numbers k such that least prime in the Goldbach partition of k increases.
 * @author Sean A. Irvine
 */
public class A025018 extends A025017 {

  private long mMax = 0;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long r = gold(mN);
      if (r > mMax) {
        mMax = r;
        return Z.valueOf(mN);
      }
    }
  }
}

