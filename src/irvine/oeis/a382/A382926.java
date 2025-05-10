package irvine.oeis.a382;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A382926 Irregular table where row n lists numbers k in row n of A162306 for which there exists a prime p | n such that k*p &gt; n.
 * @author Sean A. Irvine
 */
public class A382926 extends Sequence2 {

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
        final long gpf = Functions.GPF.l(mN);
        if (gpf * mM > mN) {
          return Z.valueOf(mM);
        }
      }
    }
  }
}

