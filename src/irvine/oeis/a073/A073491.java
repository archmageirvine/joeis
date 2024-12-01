package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073491 Numbers having no prime gaps in their factorization.
 * @author Sean A. Irvine
 */
public class A073491 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;
  private final int mNumGaps;

  protected A073491(final int numGaps) {
    mNumGaps = numGaps;
  }

  /** Construct the sequence. */
  public A073491() {
    this(0);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z[] p = Jaguar.factor(mN).toZArray();
      long cnt = 0;
      if (p.length > 1) {
        boolean wasGap = false;
        for (Z q = mPrime.nextPrime(p[0]); q.compareTo(p[p.length - 1]) < 0; q = mPrime.nextPrime(q)) {
          if (!mN.mod(q).isZero()) {
            if (!wasGap) {
              if (++cnt > mNumGaps) {
                break;
              }
              wasGap = true;
            }
          } else {
            wasGap = false;
          }
        }
      }
      if (cnt == mNumGaps) {
        return mN;
      }
    }
  }
}
