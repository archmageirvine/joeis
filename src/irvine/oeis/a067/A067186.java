package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067186 Numbers n such that C(n) = (n^2 + n + 2)/2 is prime.
 * @author Sean A. Irvine
 */
public class A067186 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z c = Z.valueOf(++mN).square().add(mN + 2).divide2();
      if (c.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

