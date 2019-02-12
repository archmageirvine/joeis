package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018788.
 * @author Sean A. Irvine
 */
public class A018788 implements Sequence {

  // After David Nacin

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    // Precompute bit sets of arithmetic progressions
    final long[] aps = new long[(mN / 2) * ((mN - 1) / 2)];
    for (int k = 0, skip = 1; skip < (mN + 1) / 2; ++skip) {
      for (int start = 0; start < mN - 2 * skip; ++start) {
        aps[k++] = (1L << start) + (1L << (start + skip)) + (1L << (start + 2 * skip));
      }
    }

    long sum = 0;
    final long limit = 1L << mN;
    // Step over all possible subsets of mN elements containing at least three elements.
    // The variable "swizzle" is a bit set recording such sets.  For each such set see if
    // it contains an arithmetic progression of length 3
    for (int i = 3; i <= mN; ++i) {
      for (long swizzle = (1L << i) - 1; swizzle < limit; swizzle = LongUtils.swizzle(swizzle)) {
        for (final long ap : aps) {
          if ((ap & swizzle) == ap) {
            // i.e. the ap (start, start+skip, start+2*skip) occurs in the set specified by swizzle
            ++sum;
            break;
          }
        }
      }
    }
    return Z.valueOf(sum);
  }
}
