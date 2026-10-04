package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057921 Numbers k such that d(k+1) divides d(k), where d(k) is number of positive divisors of k.
 * @author Sean A. Irvine
 */
public class A057921 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = Functions.SIGMA0.z(++mN + 1);
      if (t.mod(mA).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

