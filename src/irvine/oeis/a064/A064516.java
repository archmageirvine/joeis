package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A064516 Numbers n such that pi(n^2) is prime.
 * @author Sean A. Irvine
 */
public class A064516 extends A000720 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      final long s = ++mN * mN;
      while (++mM < s) {
        super.next();
      }
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

