package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066000 Size of smallest directed 1-covering code of length n.
 * @author Sean A. Irvine
 */
public class A066000 extends Sequence1 {

  // Only good for about 5 terms

  private int mN = 0;
  private int mBest = 0;
  private boolean[] mSeen = null;

  private void search(final int numCodeWords, final int numCovered, final int prevCode) {
    if (numCovered >= mSeen.length) {
      if (numCodeWords < mBest) {
        mBest = numCodeWords;
      }
      return;
    }
    if (numCodeWords >= mBest || prevCode <= 0) {
      return;
    }
    for (int code = prevCode - 1; code >= 0; --code) {
      final int[] changes = new int[mN + 1];
      int changeIndex = 0;
      if (!mSeen[code]) {
        mSeen[code] = true;
        changes[changeIndex++] = code;
      }
      for (int b = 1; b <= code; b <<= 1) {
        if ((code & b) != 0) {
          final int c = code ^ b;
          if (!mSeen[c]) {
            mSeen[c] = true;
            changes[changeIndex++] = c;
          }
        }
      }
      if (changeIndex != 0) {
        search(numCodeWords + 1, numCovered + changeIndex, code);
        for (int k = 0; k < changeIndex; ++k) {
          mSeen[changes[k]] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBest = 1 << mN;
    mSeen = new boolean[mBest];
    // All ones if always a codeword and must be included
    final int c = mSeen.length - 1;
    mSeen[c] = true;
    for (int b = 1; b <= c; b <<= 1) {
      mSeen[c ^ b] = true;
    }
    search(1, mN + 1, c);
    return Z.valueOf(mBest);
  }
}
