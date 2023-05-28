package irvine.oeis.a063;

import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.InfinitaryAliquotSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063947 Infinitary harmonic numbers: harmonic mean of infinitary divisors is an integer.
 * @author Sean A. Irvine
 */
public class A063947 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final List<Z> divisors = InfinitaryAliquotSequence.infinitaryDivisors(Jaguar.factor(++mN));
      Q sum = Q.ZERO;
      for (final Z d : divisors) {
        sum = sum.add(new Q(Z.ONE, d));
      }
      if (sum.divide(divisors.size()).reciprocal().isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
