package irvine.oeis.a162;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A162306 Irregular triangle in which row n contains the numbers &lt;= n whose prime factors are a subset of prime factors of n.
 * @author Sean A. Irvine
 */
public class A162306 extends Sequence0 {

  private long mN = 0;
  private long mM = 0;

  private boolean is(final long n, final long m) {
    final FactorSequence fm = Jaguar.factor(m);
    for (final Z p : fm.toZArray()) {
      if (n % p.longValue() != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
      }
      if (is(mN, mM)) {
        return Z.valueOf(mM);
      }
    }
  }
}

