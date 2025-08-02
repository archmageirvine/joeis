package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A056239.
 * @author Sean A. Irvine
 */
public class A079167 extends Sequence1 implements DirectSequence {

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
      sum = sum.add(fs.getExponent(p) * ++k);
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
