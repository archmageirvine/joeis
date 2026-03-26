package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394031 allocated for Aleksei Udovenko.
 * @author Sean A. Irvine
 */
public class A394031 extends Sequence1 {

  // Only good for a few terms

  private final long[] mWorkspace = new long[1000]; // Way larger than we can hope to do
  private int mN = 0;
  private int mMax = 0;

  private boolean isSidon(final int len, final long u) {
    for (int k = 0; k < len; ++k) {
      for (int j = k + 1; j < len; ++j) {
        for (int i = j + 1; i < len; ++i) {
          if ((mWorkspace[k] ^ mWorkspace[j] ^ mWorkspace[i] ^ u) == 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  private void search(final long v, final int k) {
    if (k > mMax) {
      mMax = k;
    }
    for (long u = v; u < 1L << mN; ++u) {
      if ((u & (u - 1)) != 0 && isSidon(k, u)) {
        mWorkspace[k] = u;
        search(u + 1, k + 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    // A known theorem is that WLOG 0 and 2^k, 1<=k<=mN are members
    for (int j = 1; j <= mN; ++j) {
      mWorkspace[j] = 1L << (j - 1);
    }
    mMax = mN + 1;
    search(3, mN);
    return Z.valueOf(mMax);
  }
}
