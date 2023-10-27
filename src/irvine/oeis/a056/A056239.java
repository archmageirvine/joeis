package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A056239 If n = Product_{k &gt;= 1} (p_k)^(c_k) where p_k is k-th prime and c_k &gt;= 0 then a(n) = Sum_{k &gt;= 1} k*c_k.
 * @author Sean A. Irvine
 */
public class A056239 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(Puma.primePiZ(p).multiply(fs.getExponent(p)));
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Math.toIntExact(++mN));
  }
}
