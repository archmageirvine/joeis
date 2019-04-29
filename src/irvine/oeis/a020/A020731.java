package irvine.oeis.a020;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020731.
 * @author Sean A. Irvine
 */
public class A020731 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      final long c = mFactor.factorize(Binomial.binomial(mN, mN / 2)).omega();
      for (long k = 0; k < mN / 2; ++k) {
        if (mFactor.factorize(Binomial.binomial(mN, k)).omega() > c) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
