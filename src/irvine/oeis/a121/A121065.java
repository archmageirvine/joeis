package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicByteArray;
import irvine.util.string.English;

/**
 * A121065 a(n) is the smallest number in English which contains n letter 'E's.
 * @author Sean A. Irvine
 */
public class A121065 implements Sequence {

  private int mN = -1;
  private final DynamicByteArray mCache = new DynamicByteArray();

  private int count(final int n, final char c) {
    final int g = mCache.get(n) & 0xFF;
    if (g != 0) {
      return g - 1;
    }
    final String s = English.toEnglish(n);
    int r = 0;
    for (int k = 0; k < s.length(); ++k) {
      final char d = s.charAt(k);
      if (Character.isDigit(d)) {
        throw new UnsupportedOperationException();
      } else if (d == c) {
        ++r;
      }
    }
    mCache.set(n, (byte) (r + 1));
    return r;
  }

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      if (count(k, 'e') == mN) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

