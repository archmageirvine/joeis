package irvine.oeis.a030;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030069 Size of lexicographic code of length n, Hamming distance 8 and weight 8.
 * @author Sean A. Irvine
 */
public class A030069 implements Sequence {

  private int mN = 7;

  private boolean isOk(final HashSet<Long> res, final long w, final int hammingDistance) {
    for (final long c : res) {
      if (Long.bitCount(c ^ w) < hammingDistance) {
        return false;
      }
    }
    return true;
  }

  protected Set<Long> buildLexicographicCode(final int length, final int hammingDistance, final int weight) {
    final HashSet<Long> res = new HashSet<>();
    final long limit = 1L << length;
    for (long w = (1L << weight) - 1; w < limit; w = LongUtils.swizzle(w)) {
      if (isOk(res, w, hammingDistance)) {
        res.add(w);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(buildLexicographicCode(mN, 8, 8).size());
  }
}
