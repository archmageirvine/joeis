package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068069 a(n) is the least k which is the start of n consecutive integers each with a different number, 1 through n, of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A068069 extends Sequence1 {

  private int mN = -1;
  private long mF = 1;

  @Override
  public Z next() {
    if (++mN > 20) {
      throw new UnsupportedOperationException("Factorial exceeds long, upgrade code to Z");
    }
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN > 1) {
      mF = mF * mN;
    }
    final int[] omegasM1 = new int[mN];
    long t = mF;
    for (int k = 0; k < omegasM1.length; ++k, ++t) {
      omegasM1[k] = Jaguar.factor(t).omega() - 1;
    }
    final long success = (1L << mN) - 1;
    int free = 0;
    while (true) {
      long syn = 0;
      for (final int o : omegasM1) {
        if (o > mN) {
          break;
        }
        syn |= 1L << o;
        if (syn == success) {
          return Z.valueOf(t - mN);
        }
      }
      omegasM1[free] = Jaguar.factor(t++).omega() - 1;
      if (++free == omegasM1.length) {
        free = 0;
      }
    }
  }
}

