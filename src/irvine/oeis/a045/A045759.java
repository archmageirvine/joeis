package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A045759 Maris-McGwire numbers: numbers k such that f(k) = f(k+1), where f(k) = sum of digits of k + sum of digits of prime factors of k (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045759 extends Sequence1 {

  private long mN = 6;

  static long f(final long n) {
    long sum = ZUtils.digitSum(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      sum += fs.getExponent(p) * ZUtils.digitSum(p);
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      if (f(++mN) == f(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
