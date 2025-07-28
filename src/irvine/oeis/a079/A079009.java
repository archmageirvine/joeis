package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A079009 Least k such that the 2^n successive values of phi(k+j) (j=0..2^n-1) are all distinct.
 * @author Sean A. Irvine
 */
public class A079009 extends Sequence0 {

  // Sequence is monotonic increasing, so we can continue from previous result

  private final LongDynamicLongArray mSeen = new LongDynamicLongArray(); // used as a set
  private int mN = -1;
  private long mId = 0;
  private long mM = 1;

  private boolean is(final long p, final long n) {
    ++mId; // used to mark in set and avoid reallocation etc.
    for (long k = 0; k < n; ++k) {
      final long phi = Functions.PHI.l(p + k);
      if (mSeen.get(phi) == mId) {
        return false;
      }
      mSeen.set(phi, mId);
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM, 1L << mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
