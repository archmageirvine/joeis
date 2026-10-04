package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057922 Numbers k such that d(k) divides d(k+1), where d(k) is number of positive divisors of k.
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

