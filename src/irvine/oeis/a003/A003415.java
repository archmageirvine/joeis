package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003415 <code>a(n) =</code> n' = arithmetic derivative of n: <code>a(0) = a(1) = 0, a(prime) = 1, a(mn) = m*a(n) + n*a(m)</code>.
 * @author Sean A. Irvine
 */
public class A003415 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z s = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      s = s.add((mN / p.longValueExact()) * fs.getExponent(p));
    }
    return s;
  }
}
