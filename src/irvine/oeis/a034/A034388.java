package irvine.oeis.a034;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A034388 Smallest prime containing at least n consecutive identical digits.
 * @author Sean A. Irvine
 */
public class A034388 implements Sequence {

  private int mN = 0;
  private final ArrayList<String> mZeros = new ArrayList<>();  // cache of "00...." prefixes

  private String toString(final long v, final int length) {
    final String t = String.valueOf(v);
    if (t.length() >= length) {
      return t;
    }
    final int d = length - t.length();
    while (d >= mZeros.size()) {
      mZeros.add(StringUtils.rep('0', mZeros.size()));
    }
    return mZeros.get(d) + t;
  }

  @Override
  public Z next() {
    ++mN;
    Z smallest = null;
    final String[] middle = new String[10];
    for (char k = '0'; k <= '9'; ++k) {
      final String s = StringUtils.rep(k, mN);
      final Z zs = new Z(s);
      if (zs.isProbablePrime()) {
        return zs;
      }
      middle[k - '0'] = s;
    }
    long lim = 10;
    long m = 0; // value in which to embed s
    int tlen = 1;
    while (true) { // loop over ever increasing lengths
      while (++m < lim) {
        final String t = toString(m, tlen);
        for (int j = 0; j <= t.length(); ++j) {
          // embed s at position j of t
          for (final String s : middle) {
            final String c = t.substring(0, j) + s + t.substring(j);
            if (!c.startsWith("0")) {
              final Z candidate = new Z(c);
              if (candidate.isProbablePrime() && (smallest == null || candidate.compareTo(smallest) < 0)) {
                // Found new smallest solution
                smallest = candidate;
              }
            }
          }
        }
      }
      if (smallest != null) {
        // We found a solution at this length
        break;
      }
      // Move to next length
      lim *= 10;
      m = 0;
      ++tlen;
    }
    return smallest;
  }
}
