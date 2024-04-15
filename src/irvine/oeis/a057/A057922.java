package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057922 d(n) divides d(n+1), where d(n) is number of positive divisors of n.
 * @author Sean A. Irvine
 */
public class A057922 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = Functions.SIGMA0.z(++mN + 1);
      if (mA.mod(t).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

