package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A072942 a(n) is the least x such that the cyclotomic polynomial values Phi(d,x) are prime for all d dividing n.
 * @author Sean A. Irvine
 */
public class A072942 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long[] divisors, final long k) {
    for (final long d : divisors) {
      if (!Functions.CYCLOTOMIC.z(d, k).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final long[] d = ZUtils.toLong(fs.divisors());
    long k = 1;
    while (true) {
      if (is(d, ++k)) {
        return Z.valueOf(k);
      }
    }
  }
}

