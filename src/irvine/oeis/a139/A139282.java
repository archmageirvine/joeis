package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A139282.
 * @author Sean A. Irvine
 */
public class A139282 implements Sequence {

  private int mPrev = -1;

  private int vowelCount(final String s) {
    int v = 0;
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        ++v;
      }
    }
    return v;
  }

  @Override
  public Z next() {
    if (mPrev == -1) {
      mPrev = 0;
      return Z.ZERO;
    }
    mPrev += vowelCount(English.toEnglish(mPrev));
    return Z.valueOf(mPrev);
  }
}

