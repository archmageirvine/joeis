package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A064523 Numbers n such that pi(n^2) is a square.
 * @author Sean A. Irvine
 */
public class A064523 extends A000720 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      final long s = ++mN * mN;
      while (++mM < s) {
        super.next();
      }
      if (super.next().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

