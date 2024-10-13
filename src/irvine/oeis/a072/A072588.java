package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072588 Numbers having at least one prime factor with an odd and one with an even exponent.
 * @author Sean A. Irvine
 */
public class A072588 extends Sequence1 {

  private long mN = 11;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    int seen = 0;
    for (final Z p : fs.toZArray()) {
      seen |= 1 + (fs.getExponent(p) & 1);
    }
    return seen == 3;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
