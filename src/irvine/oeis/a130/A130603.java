package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A130603 a(0)=0, a(n) = the n-th positive integer that is coprime to (a(n-1)+1).
 * @author Sean A. Irvine
 */
public class A130603 extends Sequence0 {

  private long mN = -1;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z q = mPrev.add(1);
    long k = 0;
    for (long c = 0; c < mN; ++c) {
      ++k;
      while (!Z.ONE.equals(q.gcd(Z.valueOf(k)))) {
        ++k;
      }
    }
    mPrev = Z.valueOf(k);
    return mPrev;
  }
}

