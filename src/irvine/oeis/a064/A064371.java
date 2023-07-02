package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064371 Zero, together with positive numbers n such that the n-th prime + n is a square.
 * @author Sean A. Irvine
 */
public class A064371 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
      return Z.ZERO;
    }
    while (true) {
      final Z p = super.next();
      if (p.add(++mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

