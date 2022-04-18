package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;

/**
 * A056239 If n = Product_{k &gt;= 1} (p_k)^(c_k) where p_k is k-th prime and c_k &gt;= 0 then a(n) = Sum_{k &gt;= 1} k*c_k.
 * @author Sean A. Irvine
 */
public class A056239 implements Sequence {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(mPrimePi.a(p.intValueExact() - 1).multiply(fs.getExponent(p)));
    }
    return sum;
  }
}

