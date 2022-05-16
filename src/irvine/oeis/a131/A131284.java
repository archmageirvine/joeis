package irvine.oeis.a131;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A131284 Numbers n such that difference between prime factors of n-th semiprime is n.
 * @author Sean A. Irvine
 */
public class A131284 implements Sequence {

  private long mN = 3;
  private Z mSemiprimeCount = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException();
      }
      if (sp == FactorSequence.YES) {
        mSemiprimeCount = mSemiprimeCount.add(1);
        final Z[] f = fs.toZArray();
        if (f.length == 2 && f[0].subtract(f[1]).abs().equals(mSemiprimeCount)) {
          return mSemiprimeCount;
        }
      }
    }
  }
}

