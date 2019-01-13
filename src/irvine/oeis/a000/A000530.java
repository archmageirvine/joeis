package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000530.
 * @author Sean A. Irvine
 */
public class A000530 implements Sequence {

  // For reasons of efficiency, have swapped 0 and 1, and exchanged
  // prefix for suffix in the definition.

  private int mN = 0;

  // Cache of small results.  The lowest two bits of an entry determine
  // whether or not the cache entry is valid for sides 0 and 1 respectively.
  // The next two bits then give the value of the corresponding p-value.
  // The top 4 bits are not used.
  private static final int CACHE_BITS_LIMIT = 22;
  private final byte[][] mCache = new byte[CACHE_BITS_LIMIT][];

  private void resetCache() {
    for (int k = 0; k < CACHE_BITS_LIMIT; ++k) {
      mCache[k] = new byte[1 << k];
    }
  }

  private boolean pp(final int n, final int s, final long x, final int l) {
    int c = 0;
    int t = 0;
    int b = 0;
    long v = x;
    for (int k = 0; k < l; ++k) {
      if ((v & 1) == s) {
        ++c;
        ++t;
      } else {
        if (t > b) {
          b = t;
        }
        t = 0;
      }
      v >>>= 1;
    }
    if (t > b) {
      b = t;
    }
    return c >= 2 * n - b;
  }

  private boolean p(final int n, final int s, final long x, final int l) {
    if (l >= CACHE_BITS_LIMIT) {
      return pp(n, s, x, l);
    }
    final int xx = (int) x;
    final int r = mCache[l][xx] & (5 << s);
    if (r != 0) {
      return (r & 0xC) != 0;
    }
    final boolean w = pp(n, s, x, l);
    mCache[l][xx] |= (byte) ((w ? 5 : 1) << s);
    return w;
  }

  private boolean suffixCheck(final long x, final int n) {
    long m = 1;
    long suffix = x & m;
    int k = 0;
    while (suffix != x) {
      ++k;
      if (p(n, 1, suffix, k) || p(n, 0, suffix, k)) {
        return false;
      }
      m <<= 1;
      m += 1;
      suffix = x & m;
    }
    return true;
  }

  private long count(final int n, final long x, final int len) {
    long c;
    if (p(n, 1, x, len) && suffixCheck(x, n)) {
      c = 1;
    } else {
      c = 0;
    }
    // There is a danger that the constant 4 below is not big enough,
    // would be nice to have a proof of this
    if (len < 4 * n) {
      final long xx = x << 1;
      c += count(n, xx, len + 1);
      c += count(n, xx + 1, len + 1);
    }
    return c;
  }

  @Override
  public Z next() {
    resetCache();
    return Z.valueOf(count(++mN, 1, 1));
  }
}
