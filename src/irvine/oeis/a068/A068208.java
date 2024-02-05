package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068208 Numbers n such that tau(n) - tau(n+1) = 1.
 * @author Sean A. Irvine
 */
public class A068208 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = Jaguar.factor(++mN).sigma0();
      if (t.subtract(mA).equals(Z.ONE)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
