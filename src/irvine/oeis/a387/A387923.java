package irvine.oeis.a387;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392622.
 * @author Sean A. Irvine
 */
public class A387923 extends Sequence1 {

  private long mN = 0;

  private Z m(final long k, final long n) {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(k);
    for (final Z p : fs.toZArray()) {
      sum = sum.add(CR.valueOf(p).log2().multiply(n).round().multiply(fs.getExponent(p)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z prev = m(1, mN);
    long k = 1;
    while (true) {
      final Z m = m(++k, mN);
      if (m.compareTo(prev) < 0) {
        return Z.valueOf(k - 1);
      }
      prev = m;
    }
  }
}
