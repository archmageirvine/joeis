package irvine.oeis.a068;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068080.
 * @author Sean A. Irvine
 */
public class A068060 extends Sequence0 {

  private int mN = -1;
  private boolean[] mWorkspace = null;

  private int expandSetSize(long set) {
    Arrays.fill(mWorkspace, false);
    int res = 0;
    for (int k = 1; set != 0; ++k) {
      if ((set & 1) != 0) {
        if (!mWorkspace[k]) {
          mWorkspace[k] = true;
          ++res;
        }
        if (!mWorkspace[2 * k]) {
          mWorkspace[2 * k] = true;
          ++res;
        }
        if (!mWorkspace[3 * k]) {
          mWorkspace[3 * k] = true;
          ++res;
        }
      }
      set >>>= 1;
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    final long triples = mN / 3;
    if (triples >= 63) {
      throw new UnsupportedOperationException();
    }
    mWorkspace = new boolean[mN + 1];
    // Effectively does an inclusion/exclusion calculation
    // "triples" is the number of forbidden triples for mN
    // "set" iterates over the indexes of all these triples.
    // For each set, adjust the sum according to the parity and total number of fixed elements.
    Z sum = Z.ONE.shiftLeft(mN);
    for (long set = 1L; set < (1L << triples); ++set) {
      final int parity = Long.bitCount(set) & 1;
      final int size = expandSetSize(set);
      sum = sum.signedAdd(parity == 0, Z.ONE.shiftLeft(mN - size));
    }
    return sum;
  }
}
