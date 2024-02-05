package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A056169 Number of unitary prime divisors of n.
 * @author Sean A. Irvine
 */
public class A056169 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
