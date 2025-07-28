package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A079008 a(n) is smallest number k such that the n successive values of phi(k+j) (j=0,..,n-1) are all distinct.
 * @author Sean A. Irvine
 */
public class A079008 extends Sequence1 {

  // Sequence is monotonic increasing, so we can continue from previous result

  private final LongDynamicLongArray mSeen = new LongDynamicLongArray(); // used as a set
  private int mN = 0;
  private long mId = 0;
  private long mM = 1;

  private boolean is(final long p, final int n) {
    ++mId; // used to mark in set and avoid reallocation etc.
    for (int k = 0; k < n; ++k) {
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
    while (!is(mM, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
