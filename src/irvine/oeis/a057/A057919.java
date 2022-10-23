package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057919 Numbers k such that phi(k) divides phi(k+1), where phi(k) is the Euler totient function A000010.
 * @author Sean A. Irvine
 */
public class A057919 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = Jaguar.factor(++mN + 1).phi();
      if (mA.mod(t).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

