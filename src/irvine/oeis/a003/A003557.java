package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003557 n divided by largest squarefree divisor of n; if n = Product p(k)^e(k) then a(n) = Product p(k)^(e(k)-1), with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A003557 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    long p = 1;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z d : fs.toZArray()) {
      p *= d.longValue();
    }
    return Z.valueOf(mN / p);
  }
}
