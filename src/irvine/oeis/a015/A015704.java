package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A015704 a(n) is the smallest number m such that phi(m) + sigma(m) = n*m.
 * @author Sean A. Irvine
 */
public class A015704 extends Sequence2 {

  private final LongDynamicLongArray mPhi = new LongDynamicLongArray();
  private long mN = 1;

  private long phi(final long m) {
    final long r = mPhi.get(m);
    if (r != 0) {
      return r;
    }
    final FactorSequence fs = Jaguar.factor(m);
    final long phi = fs.phi().longValueExact();
    mPhi.set(m, phi);
    return phi;
  }

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      ++m;
      if (Functions.SIGMA1.l(m) + phi(m) == mN * m) {
        return Z.valueOf(m);
      }
    }
  }
}
