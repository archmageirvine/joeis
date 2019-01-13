package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A015810.
 * @author Sean A. Irvine
 */
public class A015810 implements Sequence {

  private final LongDynamicLongArray mSigma = new LongDynamicLongArray();
  private final LongDynamicLongArray mPhi = new LongDynamicLongArray();
  private long mN = -1;

  private long sigma(final long n) {
    final long r = mSigma.get(n);
    if (r != 0) {
      return r;
    }
    final long t = Cheetah.factor(n).sigma().longValue();
    mSigma.set(n, t);
    return t;
  }

  private long phi(final long n) {
    final long r = mPhi.get(n);
    if (r != 0) {
      return r;
    }
    final long t = LongUtils.phi(n);
    mPhi.set(n, t);
    return t;
  }


  private long findIt(final long n) {
    long k = 1;
    while ((sigma(k) + n) % phi(n + k) != 0) {
      ++k;
    }
    return k;
  }

  @Override
  public Z next() {
    return Z.valueOf(findIt(++mN));
  }
}

