package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065900 Numbers n such that sigma(n) = sigma(n-1) + sigma(n-2).
 * @author Sean A. Irvine
 */
public class A065900 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = Jaguar.factor(++mN).sigma();
      if (mB.equals(mA.add(t))) {
        return Z.valueOf(mN);
      }
    }
  }
}
