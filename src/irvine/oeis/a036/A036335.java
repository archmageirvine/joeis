package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036335 Total number of composite numbers with n digits and n prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036335 implements Sequence {

  private int mN = 0;
  private long mLimit = 1;

  @Override
  public Z next() {
    long s = mLimit;
    mLimit *= 10;
    if (++mN == 1) {
      return Z.ZERO;
    }
    long count = 0;
    while (s != mLimit) {
      final FactorSequence fs = Jaguar.factor(s);
      if (fs.bigOmega() == mN) {
        ++count;
      }
      ++s;
    }
    return Z.valueOf(count);
  }
}
