package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A075603 Number of relatively prime numbers using all digits of n.
 * @author Sean A. Irvine
 */
public class A075603 extends AbstractSequence {

  /** Construct the sequence. */
  public A075603() {
    super(11);
  }

  private long mN = 10;

  private Z count(final int length, final long v) {
    final long[] digits = new long[length];
    int k = 0;
    for (long q = v; q != 0; q /= 10) {
      digits[k++] = q % 10;
    }
    final Permutation p = new Permutation(length);
    final HashSet<Long> hash = new HashSet<>();
    int[] w;
    while ((w = p.next()) != null) {
      long h = 0;
      for (int j = 0; j < length; ++j) {
        h *= 10;
        h += digits[w[j]];
      }
      hash.add(h);
    }
    long cnt = 0;
    for (final Long l : hash) {
      if (LongUtils.gcd(v, l) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 100) {
      final long t = (mN % 10) * 10 + (mN / 10);
      return LongUtils.gcd(mN, t) == 1 ? Z.ONE : Z.ZERO;
    }
    int len = 3;
    long q = mN / 1000;
    while (q != 0) {
      ++len;
      q /= 10;
    }
    return count(len, mN);
  }
}

