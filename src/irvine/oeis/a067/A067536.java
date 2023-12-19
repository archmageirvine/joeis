package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067180.
 * @author Sean A. Irvine
 */
public class A067536 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final Z a = Euler.phi(++mN * (mN + 1) * (mN + 2) / 3);
      final Z b = Euler.phi(mN);
      if (!a.mod(b).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
