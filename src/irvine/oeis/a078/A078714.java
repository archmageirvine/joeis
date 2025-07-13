package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A078714 a(n) = smallest number m which can be obtained in n ways by subtracting twice a triangular number from a perfect square.
 * @author Sean A. Irvine
 */
public class A078714 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  private Z sdt(final long n) {
    Z res = Z.ONE;
    final FactorSequence fs = Jaguar.factor(4 * n - 1);
    for (final Z p : fs.toZArray()) {
      res = res.multiply(fs.getExponent(p) + 1);
    }
    return res.divide2();
  }

  @Override
  public Z next() {
    if (++mN > 2 && Predicates.PRIME.is(mN)) {
      return Z.THREE.pow(mN - 1).multiply(7).add(1).divide(4);
    }
    while (mFirsts.get(mN) == 0) {
      final long sdt = sdt(++mM).longValueExact();
      if (mFirsts.get(sdt) == 0) {
        mFirsts.set(sdt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
