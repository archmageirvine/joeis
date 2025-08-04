package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A079168 Weighted quadratic roundness of n. If n=p_1^e_1...p^k_e^k, then a(n) = e_1 + (2^2 * e_2) + ... + (k^2 * e_k). Note that p_i&lt;p_j, i&lt;j, is assumed.
 * @author Sean A. Irvine
 */
public class A079168 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    long k = 0;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(fs.getExponent(p) * ++k * k);
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
